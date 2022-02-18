package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(100.0, 225.0, 400.0)

    for(salario in salarios){
        println(salario)
    }

    println("-----")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    println("")
    val salariosMaiorQue250 = salarios.filter { it > 250.0 }
    salariosMaiorQue250.forEach {
        println(it)
    }

    println("")
    //conta os elementos quando a {condicao} for verdadeira
    println(salarios.count {it in 200.0..500.0})

    println("")
    println(salarios.find { it == 225.0 })

    println("")
    println(salarios.find { it == 125.0 })

    println("")
    println(salarios.any { it == 100.0 })



}