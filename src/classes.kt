class carro constructor(marca: String, modelo: String){ // pode uasr tanto o "constructor" ou n para iniciar a classe
    // tambem pode iniciar botando o "var" ou "val" no proprio parenteses
    //ex: class carro (var marca: String, var modelo: String){

    var marca = marca
    var modelo = modelo

    fun quantidadecarro (nCarros: Int, linhaDeProducao: Int){
        var qCarrosDia: Int
        qCarrosDia = (nCarros * linhaDeProducao)
        print("\n a qunatidade de carros foi: "+ qCarrosDia + ". que foi prodizida por" +
                " todas as "+ linhaDeProducao+ " linhas de producoes")
    }
}

class contadorDeHistorias(){
    fun escolheHistoria(nhistoria: Int){
        if (nhistoria == 1){
            print("\n vode escolheu a historia um")
        }else if (nhistoria == 2){
                print("\n vode escolheu a historia dois")
            }else if (nhistoria == 3){
                    print("\n vode escolheu a historia tres")
                }else if (nhistoria == 4){
                        print("\n vode escolheu a historia quatro")
                  }else{
                         print("\n escolha uma historia entre 1 e 4")
                    }
    }
}


fun main() {
    val carro = carro("toyota","prius") // instanciando as classes no main
    val historia = contadorDeHistorias()
    println(carro.marca)
    println(carro.modelo)
    carro.quantidadecarro(5,10)
    historia.escolheHistoria(10)
}