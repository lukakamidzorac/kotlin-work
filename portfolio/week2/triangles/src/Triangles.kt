// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry
// Luka Kamidzorac id- 201914015

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

fun isValidTriangle(t: Triangle): Boolean {
    val (a, b, c) = t
    return a < b + c && b < a + c && c < a + b
}

fun triangleArea(t: Triangle): Double {
    val (a, b, c) = t
    val s = (a + b + c) / 2
    return sqrt(s * (s - a) * (s - b) * (s - c))
}
