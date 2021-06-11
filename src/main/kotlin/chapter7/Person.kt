package chapter7

data class Person(
    val name: String,
    val age: Int,
    var role: SchoolRole = SchoolRole.STUDENT,
    var examSubject: ExamSubject? =null
)
