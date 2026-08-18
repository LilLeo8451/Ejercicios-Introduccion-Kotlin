//Ej1
// Write your code here
data class Employee(val name: String, var salary: Int)

fun main() {
    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)
}

//Ej2
// Write your code here
data class Name(val firstName: String, val lastName: String)
data class City(val cityName: String, val country: String)
data class Address(val street: String, val city: City)

data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)

fun main() {
    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )
}

//EJ3
import kotlin.random.Random

data class Employee(val name: String, var salary: Int)

// Write your code here
class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    // Lista fija de nombres potenciales dentro del cuerpo de la clase
    val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")

    // Función para generar un empleado aleatorio
    fun generateEmployee(): Employee {
        // Selecciona un nombre aleatorio usando la función .random()
        val randomName = names.random()
        // Genera un salario aleatorio entre los límites usando Random.nextInt()
        val randomSalary = Random.nextInt(from = minSalary, until = maxSalary)
        
        return Employee(randomName, randomSalary)
    }
}

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}
