package chapter9

import chapter7.ExamSubject
import chapter7.School

fun main() {
    val school = School.makeNewSchool()
    println(school)

    school.also {
        it.toString()
    }

    val exam1: ExamSubject = ExamSubject(0, 0, 0).apply {
        this.art = 0
    }

    val exam2: Double = ExamSubject(0, 0, 0).run {
        this.art = 0
        listOf(this.art ?: 0, this.math, this.science, this.history).average()
    }

    with(school) {
        addPerson()
        val student = findStudentByLength(6)
    }
    val lotto1 = LottoNumberGenerator.generate()
        .run { LottoNumberGenerator.toReadableFormat(this) }
        .also { println(it) }
//    println(lotto1.joinToString("\n"))
}