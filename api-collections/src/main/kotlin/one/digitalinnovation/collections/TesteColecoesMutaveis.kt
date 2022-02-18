package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    println("=========== LIST ===========")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("")
    funcionarios.remove(pedro)
    funcionarios.forEach { println(it) }

    println("")
    println("=========== SET ===========")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("")
    funcionarios.add(pedro)
    funcionarios.add(maria)
    funcionarioSet.forEach { println(it) }

    println("")
    funcionarios.remove(maria)
    funcionarioSet.forEach { println(it) }





}