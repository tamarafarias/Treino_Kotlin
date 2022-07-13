// controle de fluxo com o if else

fun maiorDeIdade(idade: Int){
    if (idade > 18){
        println("Maior de idade!")

        if (idade > 60){
            println("Terceira Idade")
        }

    } else if (idade < 10){
        println("Criança")
    } else {
        println("Menor de idade!")
    }
}

fun main() {

    maiorDeIdade(idade = 20)
    maiorDeIdade(idade = 15)
    maiorDeIdade(idade = 61)
    maiorDeIdade(idade = 9)

}

