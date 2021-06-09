package chapter7

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
    println(school.findStudentByLength(5))
    println("Length 6: ${school.findStudentByLength(6)}")
    println(school.sortedStudentByLength())
}