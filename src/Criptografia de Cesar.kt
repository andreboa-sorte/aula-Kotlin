fun criptografa( texto : String,  cifra : Int): String{
    var result = ""

    for ( i in 0 until texto.length ) {

        val charOriginal = texto[i].toInt()
        val newChar = (charOriginal + cifra).toChar()
        result += newChar
    }
    return result
}
fun descriptografa(texto : String,  cifra : Int): String{
    return criptografa( texto, cifra * -1 )
}

fun main() {
    println("Digite o texto claro: ")
    var texto = readLine()!!
    println("Digite a Crifra: ")
    var cifra = (readLine()!!).toInt()

    println("a palavra digitada é: $texto")
    texto = criptografa(texto, cifra)

    println("o texto criptografado é: $texto" )
    println("o texto descriptografado é: " + descriptografa(texto,cifra))

}