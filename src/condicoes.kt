fun main() {
    var num1 = 3
    var num2 = 3
    if(num1 == num2){
        println("if de comparacao padrao para ver se e IGUAL")
    }

    if (num1 != num2){
        println("if de comparao para ver se e DIFERENTE")
    }

    if (num1 %2 == 0){
        println("if para ver se o num1 e PAR (divisivel por 2, SEM dar resto)")
    }

    if (num1 %2 != 0){
        println("if para ver se o num1 e IMPAR (divisivel por 2, DANDO RESTO)")
    }
    //as condicoes sao tudo padrao. == | > | < | != OU %2 == 0
    // os || (OU) e && (E) tambem sao padrao
    // tambem e igual o else e o else if

    // RESUMINDO TUDO!!!!
    //TODAS AS CONDICOES PADROES, SAO IGUAL AS OUTRAS DE OUTRAS LINGUAS

    //A UNICA COISA QUE MUDA E QUE EM TEM O "when"  NOVA CONDICAO QUE E SEMELHANTE AO SWITCH

    //EX de menu
    while(true) {
        val op = 5

        when (op) {
            1 -> println("esta e a opcao um") // a "->" e usada para mostrar o que acontece caso
                                                // seja o numero que esta antes dela
            2 -> println("esta e a opcao dois")
            3 -> println("esta e a opcao tres")
            4 -> println("esta e a opcao quatro")
            else -> break
        }
    }

}