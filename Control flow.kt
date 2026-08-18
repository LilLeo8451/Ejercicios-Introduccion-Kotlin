//Ej1
fun main() {
    var pizzaSlices = 0
    
    // Mientras tengamos menos de 7 rebanadas, seguimos sumando y lamentándonos
    while (pizzaSlices < 7) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    
    // Agregamos la última rebanada para completar la pizza
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

//Ej2
fun main() {
    for (i in 1..100) {
        when {
            // Divisible entre 3 y 5
            i % 3 == 0 && i % 5 == 0 -> println("fizzbuzz")
            // Divisible solo entre 3
            i % 3 == 0 -> println("fizz")
            // Divisible solo entre 5
            i % 5 == 0 -> println("buzz")
            // Si no cumple ninguna de las anteriores, imprime el número
            else -> println(i)
        }
    }
}

//Ej3
fun main() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    
    // Recorremos cada palabra de la lista
    for (word in words) {
        // Verificamos si la palabra comienza con 'l'
        if (word.startsWith("l")) {
            println(word)
        }
    }
}