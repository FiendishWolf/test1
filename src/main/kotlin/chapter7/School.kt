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

    companion object {

        fun makeNewSchool() = School().apply {
            this.addPerson(Person("Swann", 40, SchoolRole.TEACHER))
            this.addPerson(
                Person("James", 18, examSubject = ExamSubject(0, 0, 0)),
                Person("Matthew", 18, SchoolRole.STUDENT, ExamSubject(100,100,100)),
                Person("Tychus", 18),
                Person("Arcturus", 18),
                Person("Artanis", 18)
            )
        }
    }
}