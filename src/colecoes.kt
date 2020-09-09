fun main() {

    var lista = arrayListOf(1,2,3,4) // para criar uma array, precisa do comenado "arrayListOf()"
                                    //e depois colocar os conjuntos dentro dos ()
    println(lista)
    println("o primeiro elemento e: " + lista.first()) //printar o primeiro valor da lista
    println("o ultimo elemento e: " + lista.last()) //printa o ultimo valor da lista
    println("o tamanho da lista e: " + lista.size)// da o tamalho da lista (quantidade de variaves dentro dela)

    lista.add(0,31) // .add esta adicinando um valor na lista, dentro dos () se coloca em ordem
                                // primeiro o index de onde vai ser adicionado na lsita e depois o elemento
                                // que deseja adicionar. ele adiciona na lista e caso tenha um valor no index apontado
                                // ele passa o valor entrado para a proxima casa da fila
    println(lista)

    println(lista.indexOf(31)) // vai retornar o index do valor que estiver dentro da lista
                            //(ele sai comparando a lista e assim que achar o uma variavel com o mesmo valor da
                            // que foi colocada entre (), ele retorna em que posicao da lista esta)

    lista.remove(31) // remove elemento de dentro da lista
    print(lista)


    var dicionario = hashMapOf("a" to "arroz", "b" to "bola", "v" to "aviao") // esse modelo de hashmap, ele pega e interpreta
                                                            // o tipo de variavel que tem dentro (ex: "String", "String") mas
                                                            // nao pode misturar os tipos (ex: botar um "Int", "Int" no meio de um
                                                            // hashmap de full String)

    println(dicionario)
    //println(dicionario[1]) //pode chamar assim ou com .get
    println(dicionario.get("a"))
    dicionario.put("d", "dado" ) //.put ele adiciona dentro do hashmap
    println(dicionario.get("d"))

}





