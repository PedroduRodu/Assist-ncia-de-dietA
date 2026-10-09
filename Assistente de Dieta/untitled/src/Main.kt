fun main() {
    var proteinas = 0.0
    var carboidratos = 0.0
    var gorduras = 0.0

    print("Quantas refeicoes voce fez hoje? ")
    val quantidade = readln().toInt()

    for (i in 1..quantidade) {
        println("\nRefeicao $i")

        print("Proteinas (g): ")
        proteinas += readln().toDouble()

        print("Carboidratos (g): ")
        carboidratos += readln().toDouble()

        print("Gorduras (g): ")
        gorduras += readln().toDouble()
    }

    val calorias = proteinas * 4 +
            carboidratos * 4 +
            gorduras * 9

    print("\nMeta de calorias: ")
    val metaCalorias = readln().toDouble()

    print("Minimo de proteinas (g): ")
    val minimoProteinas = readln().toDouble()

    println("\n--- RESUMO DO DIA ---")
    println("Proteinas: $proteinas g")
    println("Carboidratos: $carboidratos g")
    println("Gorduras: $gorduras g")
    println("Calorias: $calorias kcal")

    if (calorias > metaCalorias ||
        proteinas < minimoProteinas) {
        println("Atencao: uma das metas precisa ser avaliada!")
    } else {
        println("Voce esta dentro das metas!")
    }
}