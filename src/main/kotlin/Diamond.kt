class DiamondPrinter {

    fun printToList(char: Char): List<String> {

        val quarter = ('A'..char).map {
            "${" ".repeat(char - it)}$it${" ".repeat(it - 'A')}"
        }

        val half = quarter.map { "$it${it.dropLast(1).reversed()}" }

        return half.plus(half.dropLast(1).reversed())
    }

}
