fun main() {

    helloWorld()
//existem algumas maneiras de chamar as funções, logo a abaixo está a declaração dela em uma variável
    val somar = soma(10, 5)


//no print é possível ver que a função foi chamada diretamente da variável
    println("a soma entre 10 e 5 é ${soma(10,5)}")
}

//a função a baixo tem um retorno (Int), logo, é necessário estabelecer o return e estabelecer a lógica que deverá ser seguida
fun soma (a:Int, b:Int):Int {

    return (a+b)
//os valores são estabelecidos dentro do retorno, podendo ser declarados qunando chamada a função. Colocar a função entre parantesis facilita sua leitura


}
//há também a possibilidade de se fazer uma unica linha de código, sendo chamada. Ex.

fun soma2 (c: Int, d:Int) = (c + d)

// não precisa ser uma função que haja retorno de fato, a função acima não teve retorno, mas poderiamos fazer a função hello world e ter um retorno em println

fun helloWorld(){

    println("Hello, world!")
//para invocar essa função é necessário chamar dentro da função principal (main)
//essa função é do tipo sem retorno (unity), entretanto não é necessário declarar pois já está subentendido pelo programa do que se trata
}