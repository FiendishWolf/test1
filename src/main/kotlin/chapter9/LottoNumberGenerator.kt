package chapter9

object LottoNumberGenerator {
    private val nextNumber get() = (1..45).random()

    fun generate(): List<LottoLine> {
        val result = mutableListOf<LottoLine>()
        repeat(5) {
            result.add(extractOneLine())
        }
        return result
    }

    fun toReadableFormat(result: List<LottoLine>) = result.joinToString("\n")

    private fun extractOneLine(): LottoLine {
        val temp = mutableSetOf<Int>()
        while (temp.size <= 5) {
            temp.add(nextNumber)
        }
        val result = temp.toSortedSet()
        var bonusNumber: Int
        while (true) {
            val number = nextNumber
            if (!result.contains(number)) {
                bonusNumber = number
                break
            }
        }
        return LottoLine(result, bonusNumber)
    }


    data class LottoLine(
        val list: Set<Int>,
        val bonusNumber: Int
    ) {
        override fun toString() = "$list + $bonusNumber"
    }

}