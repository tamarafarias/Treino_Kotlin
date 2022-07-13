fun main() {
    println("Hello, world!")

    // Variáveis são as responsáveis pelo armazenamento de valores, elas são declaradas pelo termo "var", seguido pelo valor declarado e após a atribuição do valor, ex.

    var nome = "Tamara"

    //essa variável foi declarada e instanciada, toda variável tem tipo, essa declarada é o tipo texto
    //variáveis não podem assumir palavras reservadas -as palavras em rosa, ex. fun, var..- sempre dará erro caso tente

    println(nome)  //nesse caso foi designado um parametro para uma função

    // existem variáveis mutáveis e imutaveis. Sempre que for uma variável "var" esta pode ser mudada, ou seja, a var é mutável!! var = variable
    //Também existe a variável imutável, essa é a "val", uma vez declarado o seu valor não poderá ser alterado.  val = value

    val name = "Tamara"
    val lastname = "Farias"

    //Para se utilizar uma variável dentro de uma string se utiliza o $, de modo a chamar o valor desta variável e manter de maneira mais limpa, sem ser necessária a concatenação com o uso do +.
    //O nome técnico é interpolação
    println("olá, $name $lastname")

}