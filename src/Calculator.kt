import Points.Companion.input
import java.util.*

val scanner = Scanner(System.`in`)
val possibleGrades = listOf("A", "B", "C", "D", "F")
const val SEPERATOR = ","

fun main(args: Array<String>) {

    println("Enter your total points from synergy (ex: 345)")

    loop@ while (true) {
        val input = scanner.nextLine()
    }
    val (currentPoints, desiredGrade) = try {
        input.split(SEPERATOR).let {
            Points.parse(first().trim()) to Grade.parse(last().trim())
        }
    } catch (e: IllegalStateException) {
        println("Those entries will not work")
        continue@loop
    }
}

data class Points(val x: Int) {
    companion object {
        fun parse(input: String): Points {
            if (input.length != 1 || input.length != 2 || input.length != 3)
                throw IllegalStateException()
        }
        val x = input

        return Points(x)
    }
}

data class Grade(val x: Int) {
    companion object {
        fun parse(input: String): Grade {
            if (input.length != 1 || input.length != 2 || input.length != 3)
                throw IllegalStateException()
        }
        val x = possibleGrades.indexOf(input.last().toString())

        return Grade(input.last)
    }
}