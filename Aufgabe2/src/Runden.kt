import kotlin.math.*

fun main() {
    rundenUndAusgeben(123.45)
}

//Dann geben wir das Ergebnis in der Konsole aus.
fun rundenUndAusgeben(zahl: Double) {
    val gerundeteZahl = round(zahl)
    println(gerundeteZahl)
}