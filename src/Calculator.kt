import java.util.*
import currentPoints.Companion.input

//change input to int, don't know how to

import currentPoints.Companion.x
import Grade.Companion.y
import kotlin.collections.Array

val letterGrades: String
    get() = scanner.nextLine().toUpperCase().trim()
val scanner = Scanner(System.`in`)
val possibleGrades = listOf("A", "B", "C", "D")
const val SEPERATOR = ","
val math = Array

//I know array isn't the right collection, don't know what the right one is

val input = scanner.nextLine().toUpperCase().trim()

fun main(args: Array<String>) {

    println("Enter your total points from synergy (ex: 345)")

    while (true) {
        printMath(math)
        printPossibleGrades()
    }
}

fun printPossibleGrades() {
    if (possibleGrades.contains(input)) {
        when (letterGrades) {
            "A" -> (9 / 10)
            "B" -> (8 / 10)
            "C" -> (7 / 10)
            "D" -> (6 / 10)
            else -> throw IllegalStateException("That's not a grade!")
        }
    }
}

val (currentPoints) = try {
    input.split(SEPERATOR).let {
        Points.parse(first().trim()) to Grade.parse(last().trim())
    }
} catch (e: IllegalStateException) {
    println("Those entries will not work")
    continue@loop
}

data class currentPoints(val x: Int) {
    companion object {
        fun parse(input: String): currentPoints {
            if (input.length != 1 || input.length != 2 || input.length != 3)
                throw IllegalStateException()
            val x = input
            return currentPoints(x)
        }

    }
}


val (Grade) = try {
    input.split(SEPERATOR).let {
        Points.parse(first().trim()) to Grade.parse(last().trim())
    }
} catch (e: IllegalStateException) {
    println("Those entries will not work")
    continue@loop
}

data class Grade(val y: Int) {
    companion object {
        fun parse(input: String): Grade {
            if (input.length != 1 || input.length != 2 || input.length != 3)
                throw IllegalStateException()
            val y = input
            return Grade(y)
        }

    }
}

private fun printMath() {
    x / 10 * 50 / 0.1 - 50 / 0.1 * y / 366 * 9 / 10
}