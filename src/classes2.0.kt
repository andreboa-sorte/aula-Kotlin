import java.util.*

open class estoque(var preco: Double, var marca: String, var nome: String){ // o open como o proprio nome diz, deixa a classe aberta
                                                                            // deixando aberta, pode se criar classes filhas ou metodos filhos
                                                                            //com o open fun
    open fun lista(preco: Double, marca: String, nome: String){ // aqui esta deixando a função aberta apra as outras clases possçao aleterar ela
        println("o produto: $nome é da marca: $marca  e com o preco de: $preco")
    }
}

class pereciveis(preco: Double, marca: String, nome: String, var validade: String) : estoque(preco, marca, nome){
    override fun lista(preco: Double, marca: String, nome: String) { //override é usado para reescrever e alterar o metodo pai
        //super.lista(preco, marca, nome)
        println("o produto: $nome é da marca: $marca, com o preco de: $preco e validade de: $validade")
    }

}

fun main() {
    val produto = pereciveis(3.50, "comida do ze", "arroz","11/01/2020")
   produto.lista(3.50, "comida do ze", "macarrao")
}