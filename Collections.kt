//Ej1

fun main() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    
    // Write your code here
    println(greenNumbers.size + redNumbers.size)
}

//Ej2
fun main() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    
    // Write your code here
    val isSupported = requested.uppercase() in SUPPORTED 
    
    println("Support for $requested: $isSupported")
}

//Ej3
fun main() {
    // Write your code here
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three") 
    val n = 2
    
    // <Write your code here> será reemplazado por number2word[n]
    println("$n is spelled as '${number2word[n]}'")
}