//comentario é com "/"


fun main() {
    fun sobreprint(){
        val texto = "isso é um text imutavel" // toda variavel com "val" na frente, é uma variavel imutavel,
                                            // ou seja, não da para alterar o valor dela ou adicionar valor
        println(texto)
        var textinho = "esse textinho pode ser alterado"
        println(textinho)
        textinho = "foi alterado"
        println(textinho)
        var textolongo = """este e um exemplo de como
        |se pode usar um print de varias linhas de
        |uma vez so""".trimMargin() // o ".trimMargin()" serve para deixar tudo na mesma linha e alinhado.
                                    // o "|" serve para indicar que ali será a magem q vai alinhar com o
                                    //canto esquedo do terminal
        println(textolongo)

        println("usando uppercase: /n")
        var up = textinho.toUpperCase()//transforma em tudo em caps
        println("foi alterado em caps: " + up)
        // da tanto para printar padrao ou com o 'ln', sem o ln, ele concatena com a linha de cima

        // dentro do print, se pode adicionar variveis como o '+' padrao ou com o'$'
        println("exemplo de print igual com o '$' : $textinho")

        // para comprar se tem toda frase em uma variavel str, usamos o ".contentEquals()" passando a frase que
        // desejamos comprar no parenteses
        var contem = texto.contentEquals("isso é um text imutavel")
        println("comparacao exata se tem o conteudo igual da varaivel texto  = "+contem)

        //para ver se tem somente algo dentro da variavel, usamos o 
    }

    fun sobrefun(){
        fun recebenum(numero:Int, nome:String){
            println("o numero e: " + numero + " e o nome e: " + nome)
        }
        recebenum(36,"andre")

        fun voltanum(numero:Int):Int {
            var temp = (numero+1)

            return temp
        }
        var strnumero = voltanum(500)
        println(strnumero)
    }

    sobreprint()
    sobrefun()

}