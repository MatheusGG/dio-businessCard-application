package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 5
    values[3] = 6
    values[4] = 3

    print("")
    for(valor in values){
        println(valor)
    }
    print("")
    values.forEach {
        println(it)
    }
    print("")
    values.forEach { valor ->
        println(valor)
    }
    print("")
    for(index in values.indices) {
        println(values[index])
    }
    print("")

    values.sort()

}