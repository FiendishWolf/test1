package chapter7

data class Person(
    val name: String,
    val age: Int,
    var role: SchoolRole,
    var examSubject: ExamSubject? =null
)
