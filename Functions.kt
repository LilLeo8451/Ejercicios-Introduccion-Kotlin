//Ej1
fun main() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    
    // Usamos map para transformar cada elemento "it" en la URL completa
    val urls = actions.map { "$prefix/$id/$it" }
    
    println(urls)
}

//Ej2
fun repeatN(n: Int, action: () -> Unit) {
    // Un bucle que se ejecuta 'n' veces
    for (i in 1..n) {
        action() // Ejecutamos la función que recibimos por parámetro
    }
}

fun main() {
    // Llamamos a la función indicando que repita 5 veces la acción entre llaves
    repeatN(5) {
        println("Hello")
    }
}
