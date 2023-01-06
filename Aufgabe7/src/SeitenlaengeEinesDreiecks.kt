import kotlin.math.*

fun main() {
    println(seiteC(12.56, 3.56))
}

fun seiteC(a: Double, b: Double): Double{
    return sqrt(a.pow(2) + b.pow(2))
}

/*
    c^2 = a^2 + b^2
*/