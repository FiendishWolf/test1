package chapter7

class School {
    private val personList = mutableListOf<Person>()

    val students get() = personList.filter { it.role == SchoolRole.STUDENT }

    fun addPerson(person: Person) {
        this.personList.add(person)
        printPerson()
    }

    fun addPerson(vararg person: Person) {
        this.personList.addAll(person)
        printPerson()
    }

    fun findStudentByLength(length: Int) =
        this.personList
            .filter { it.role == SchoolRole.STUDENT }
            .filter { it.name.length == length }

    fun sortedStudentByLength() =
        this.personList
            .filter { it.role == SchoolRole.STUDENT }
            .sortedBy { it.name.length }

    private fun printPerson() {
        val teacherList = this.personList.filter { it.role == SchoolRole.TEACHER }
        val studentList = this.personList.filter { it.role == SchoolRole.STUDENT }
        println("Student: $studentList")
        println("Teacher: $teacherList")
    }
}