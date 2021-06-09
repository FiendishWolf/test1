package chapter8

import chapter7.ExamSubject
import chapter7.Person
import chapter7.School
import chapter7.SchoolRole
import kotlin.random.Random.Default.nextBoolean

val nextScore get() = (0..100).random()

fun main() {
    val school = School()
    school.addPerson(Person("Swann", 40, SchoolRole.TEACHER))
    school.addPerson(
        Person("James", 18, SchoolRole.STUDENT),
        Person("Matthew", 18, SchoolRole.STUDENT),
        Person("Tychus", 18, SchoolRole.STUDENT),
        Person("Arcturus", 18, SchoolRole.STUDENT),
        Person("Artanis", 18, SchoolRole.STUDENT)
    )

    println(school.students)

    school.students.map {
        it.apply {
            this.examSubject = ExamSubject(science = nextScore, math = nextScore, history = nextScore).apply {
                if (nextBoolean()) {
                    art = nextScore
                }
            }
        }
    }

    println(school.students)

    school.students.forEach { Person ->
        val examSubject: ExamSubject? = Person.examSubject
        if (Person.examSubject != null) {
            Person.examSubject?.art
        }

        Person.examSubject?.let { ExamSubject ->
            val history: Int = ExamSubject.history
            ExamSubject.art?.let {
                println("${Person.name}의 미술 점수는 ${it}점 이다.")
            }
        }
    }

}