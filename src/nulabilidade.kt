fun main() {
    var nome: String = "tio ze"
    //nome = null (vai dar erro se tentar deixar nulo uma varivel que foi inicializado com um valor)
                //resumindo, uma varivel com valor, nunca pode ser nulla, mas uma varivel que se inicializou
                // como nula, ela pode voltar a ser nula; ou seja, se quiser anular uma varival depois de usar ela,
                //tem que inicializar no comeco como nulo

    var nomenulo: String? = "tio ze fantasma" // qunado colocamos o "?" no lado do tipo da vaiavel, quer dizer
                                            // que ela pode ser uma varivel nula, ou seja, podemos deixala nula
    println(nomenulo)

    nomenulo = null

    println(nomenulo)
  // var tamanho = nomenulo.length (como iniciamos a variavel podendo ser nula ou n, n da para simplesmente chamar um
    // metodo, pois o compilador nao vai saber qunado que e nulo ou n o valor dentro da variavel)
    //entao tem que "checar" para ver se e nulo ou n

    //PRIMEIO JEITO DE RESOLVER

    nomenulo = "teste" // caso queira deixar nulo, e so comentar que vai deixar o nulo da linha 12

    if (nomenulo != null){
        var tamanho = nomenulo.length
        println("o nome: " + nomenulo + " tem "+ tamanho + " casas")
    } else if (nomenulo == null){
        println("nome nulo")
    }


    //SEGUNDO JEITO DE RESOLVER

    //usamos os safe call operator "?"
    // ou seja, botamos o "?" ao lado da varivel e antes de chamar o metodo
    //ex: nomenulo?.length
    println("\n segundo jeito: " + nomenulo?.length) // bem mais facil de se uasar

    // caso nao tenha nada, printa "null" (que nem na linha 14)

    //TERCEIRO JEITO DE RESOLVER

    //usamos o elvis operator

    nomenulo = null

    println(nomenulo?.length ?: "\n nulo. terceiro jeito") // o "?:" que tem depois, e o elvis operator
                                        //ele faz com que seja entregue algo caso seja null
                                        // assim da para personalizar a resposta quando e nulo
    // o metodo e jeito uasdo dentro do print, n quer dizer que funciona so no print, pode tambem ser usado
    // em outras situacoes. ex: var terceirojeito = nomenulo?.length ?: "nulo. terceiro jeito"

    // outro exemplo do que se pode fazer com o elvis operaotr

    var seNulo = nomenulo ?: "\n nao sou mas nulo" // ele passa o valor para a variavel seNulo e se o valor for null
                                                // ele bota o q eu coloquei depois do "?:"

    println(seNulo)


    //"QUARTO JEITO"

    // caso queira usar uma "trava" de seguraça caso o valor seja nulo
    // usamos o "!!". quando botamos ele, qunado for o valor for nulo, ele vai travar
    // o compilador e dar erro

    //nomenulo = "nome"  //(caso queira testar sem ser nulo a variavel, so tirar o comentario)

    //print(nomenulo!!.length) // (caso queira testar, bastat tirar o comentario)
}