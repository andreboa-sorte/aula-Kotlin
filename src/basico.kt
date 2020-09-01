//comentario é com "/"


fun main() {
    fun sobreprint(){
        val texto = "isso é um texto imutavel" // toda variavel com "val" na frente, é uma variavel imutavel,
                                            // ou seja, não da para alterar o valor dela ou adicionar valor
        println(texto)
        //caso queira definir o tipo da varivel, vc coloca ela com : e o tipo, depois do nomo. ex: var texto: String
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

        // "\n" = nova linha
        //"\t" = tab (da o espaco do tab onde e colocado)
        //"\b" = apaga (backspace)
        //"\r" = printa somente o que vai ter depois do \r
        // "\"" " = com so a \ da para colocar o " no meio dos ("...") sem fechar os "
        //"\$" =  como o $ tambem e usado para poder chamar variavel, usar o \$ e uma garantia
                // para sair como str e n como auxiliar de chamar  uma variavel

        println("\n usando uppercase: \n")
        var up = textinho.toUpperCase()//transforma em tudo em caps
        println("foi alterado em caps: " + up)
        // da tanto para printar padrao ou com o 'ln', sem o ln, ele concatena com a linha de cima

        // dentro do print, se pode adicionar variveis como o '+' padrao ou com o'$'
        println("exemplo de print igual com o '$' : $textinho")

        // para comprar se tem toda frase em uma variavel str, usamos o ".contentEquals()" passando a frase que
        // desejamos comprar no parenteses
        var contem = texto.contentEquals("isso é um texto imutavel")
        println("comparacao exata se tem o conteudo igual da varaivel texto  = "+contem)

        //para ver se tem somente algo dentro da variavel, usamos o ".contains()"
        contem = texto.contains("texto")
        println("ver se tem algo igual = "+contem)
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
        //para setar valor defalt dentro de uma funcao, vc bota dentro dos (), junto com o tipo da variavel
        //como se estivesse atribuindo um valor normal a ela
        fun defaltvalor (padrao: String ="estre é o valor padrao"){
            println(padrao)
        }

        defaltvalor()
        defaltvalor("mudei o valor padao para algo passado")
    }


    //sobreprint()
    //sobrefun()

}