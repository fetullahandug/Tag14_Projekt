
<h1 align="center">Grundlagen der Programmierung</h1>
<h3 align="center">Library Functions und Packages</h3>
<br>

<p align="center">
  <img src="img/node-modules-simple-project-sometimes-vanilla-programming-is-better-63232899.jpg" />
</p>


#### Beschreibung:

Willkommen zurück zu den Übungen an Tag 14 und dem Thema Library Functions und Packages. Viel Spaß!

#### Hinweise zur Bearbeitung:

- Achte auf einen sauberen Quellcode, insbesondere Einrückungen sind wichtig!
- Wichtige Materialien für heute:
    - [Handbuch: Funktionen → Verstehen → Funktionen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.guex9q8ivm5c)
    - [Handbuch: Funktionen → Verstehen → Nachschlagen](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.u676eqx2mr9g)
    - [Handbuch: Funktionen → Verstehen → Implementieren](https://docs.google.com/document/d/13SyoQ3tgIr4T9tiUl42V5kiBGQwV4Lk-XA2SsKf-va0/edit#heading=h.sob84nj0fjy0)
    - [Kotlin Dokumentation](https://kotlinlang.org/docs/home.html)
    - [Kotlin Standard Library](https://kotlinlang.org/api/latest/jvm/stdlib/)
    - [Kotlin Package -> Math](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.math/)
    - [Kotlin Package -> Text](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/)

---


<details>
<summary> <b> Aufgabe 1 - Intro </b> </summary>

In dieser Aufgabe gehen wir Schritt für Schritt auf Packages ein, 
wie man sie importiert und wie man sie schlussendlich verwendet.

- Schau dir das Intro in der Intro.kt Datei an.


**Modul für die Aufgabe:** *Aufgabe1*  
**Datei für die Aufgabe:** *Intro.kt*


</details>


---


<details>
<summary> <b> Aufgabe 2 - Zahl runden </b> </summary>

In dieser Aufgabe soll die generelle Vorgehensweise verdeutlicht werden.
Du kannst den Code selbst schreiben oder ihn aus der Aufgabenbeschreibung kopieren.

Erstelle eine Funktion, die eine Zahl rundet und das Ergebnis in der Konsole ausgibt.



1. Importiere hierfür zuerst das math Package von Kotlin,
indem du in der ersten Zeile der Datei `import kotlin.math.*` schreibst.
2. Schreibe darunter dann die main()-Funktion:
```
fun main() {

}
```
3. Schreibe unter der main-Funktion dann die Funktion mit einem Double als Parameter.
```
fun rundenUndAusgeben(zahl: Double) {
    
}
```
4. Im Rumpf der Funktion rufen wir jetzt die round()-Funktion des math-Package mit dem Parameter auf
und legen das Ergebnis in einer Konstante ab.
```
fun rundenUndAusgeben(zahl: Double) {
    val gerundeteZahl = round(zahl)
}
```
5. Dann geben wir das Ergebnis in der Konsole aus.
```
fun rundenUndAusgeben(zahl: Double) {
    val gerundeteZahl = round(zahl)
    println(gerundeteZahl)
}
```
6. Schlussendlich prüfen wir das Ergebnis, 
indem wir die Funktion mit der Zahl 123.45 aufrufen.
```
fun main() {
    rundenUndAusgeben(123.45)
}
```
7. Wenn in der Konsole 123.0 ausgegeben wird, hast du die Funktion richtig erstellt.

**Modul für die Aufgabe:** *Aufgabe2*  
**Datei für die Aufgabe:** *Runden.kt*


</details>

---

<details>
<summary> <b> Aufgabe 3 - Der absolute Wert einer Zahl</b> </summary>

Erstelle eine Funktion, die einen Integer als Parameter bekommt,
den absoluten Betrag des Parameters berechnet und das Ergebnis in der Konsole ausgibt.

Zur Erinnerung: der absolute Betrag einer Zahl ist die Zahl ohne ihr (negatives) Vorzeichen.  
Z.B. der absolute Betrag von -6 ist 6 (aus Minus wird Plus),  
der absolute Betrag von 10 ist 10 (Aus Plus bleibt Plus). 

1. Importiere hierfür zuerst das math-Package.
2. Schreibe die Funktion.
3. Verwende zum Berechnen des absoluten Betrages die abs()-Funktion.
4. Prüfe deine Funktion, indem du sie in der main-Funktion mit dem Wert -42 aufrufst.
Kommt 42 raus?  
Prüfe deine Funktion ebenfalls indem du sie mit 20 aufrufst. 
Kommt 20 raus?



**Modul für die Aufgabe:** *Aufgabe3*  
**Datei für die Aufgabe:** *AbsolutRechner.kt*

</details>



---

<details>
<summary> <b> Aufgabe 4 - Die kleinere von zwei Zahlen </b> </summary>

Erstelle eine Funktion, die zwei Double als Parameter bekommt,
die kleinere von den zwei Zahlen bestimmt und das Ergebnis in der Konsole ausgibt.

1. Importiere hierfür zuallererst das richtige Package.
2. Schreibe die Funktion.
3. Prüfe deine Funktion, indem du sie in der main()-Funktion mit den Werten 123.45 und 5.67 aufrufst.
Wird 5.67 ausgegeben?

**Modul für die Aufgabe:** *Aufgabe4*  
**Datei für die Aufgabe:** *DieKleinereZahl.kt*

</details>

---

<details>
<summary> <b> Aufgabe 5 - Quadrate und ihre Seitenlaengen</b> </summary>

Schreibe eine Funktion, welche die Fläche eines Rechtecks als Double erhält und die Seitenlänge zurückgibt.  
Hierfür benötigt ihr die sqrt()-Funktion aus dem math-Package.

Die Seitenlänge eines Quadrates kann man berechnen, indem man die Wurzel aus der Fläche zieht.  

Formel:
`Seitenlänge = sqrt(Fläche)`

1. Importiere hierfür zuerst das richtige Package.
2. Schreibe die Funktion, verwende dabei die Formel.
3. Prüfe deine Funktion, indem du sie in der main()-Funktion mit dem Wert 64.0 aufrufst 
und das Ergebnis in der Konsole mit der println()-Funktion ausgibst.
Wird 8.0 ausgegeben?
4. Prüfe ebenfalls deine Funktion, indem du sie in der main()-Funktion mit dem Wert 1089.0 aufrufst
und das Ergebnis in der Konsole mit der println()-Funktion ausgibst.
Wird 33.0 ausgegeben?



**Modul für die Aufgabe:** *Aufgabe5*  
**Datei für die Aufgabe:** *SeitenlaengeEinesQuadrats.kt*



</details>

---

<details>
<summary> <b> Aufgabe 6 - Umfang eines Kreises berechnen </b> </summary>

Schreibe eine Funktion, welche als Parameter den Radius eines Kreises als Double erhält,
den Umfang des Kreises berechnet und das Ergebnis zurückgibt.
Hierfür benötigt ihr die Konstante PI aus dem math-package.

Der Umfang eines Kreises berechnet man so:

Formel:
`Umfang = 2 * PI * Radius`

PI ist eine Konstante vom Typ Double.

Nachdem man das math-Package importiert hat, kann man einfach auf die Konstante `PI` zugreifen,
wie man auf selbsterstelle Konstanten zugegriffen hat. Ein Beispiel.
```
val piMalZwei: Double = PI * 2  // Ist gleich 6.283185307179586
```


1. Importiere hierfür zuerst das richtige Package.
2. Schreibe die Funktion, verwende dabei die Formel.
3. Prüfe deine Funktion, indem du sie in der main()-Funktion mit dem Wert 5.5 aufrufst
   und das Ergebnis in der Konsole mit der println()-Funktion ausgibst.
   Wird in etwa 34.55 ausgegeben?  
   (Das Ergebnis kann sich bei verschiedenen Computern ein kleines bisschen unterscheiden,
   deswegen vergleichen wir nur bis zur 2. Nachkommastelle)

**Modul für die Aufgabe:** *Aufgabe6*  
**Datei für die Aufgabe:** *UmfangEinesKreises.kt*

</details>

---

<details>
<summary> <b> Aufgabe 7 - Dreiecke und ihre Seitenlängen </b> </summary>

Schreibe eine Funktion, welche zwei Seitenlängen a und b eines rechtwinkligen Dreiecks als Double erhält, 
die Seite c berechnet und die Seite c zurückgibt.  
Die Seiten a und b stehen im rechten Winkel zueinander.  
Hierfür benötigt ihr die sqrt() und pow() Funktion aus dem richtigen math-Package.


Nach dem Satz des Pythagoras berechnet man die Länge der Seite c eines rechtwinkligen Dreiecks 
mithilfe der Länge der anderen Seiten a und b mit der Gleichung:

c^2 = a^2 + b^2

(Das ^ Zeichen steht für "hoch", z.B. 2^2 = 2 hoch 2)


1. Importiere hierfür zuerst das richtige Package.
2. Erstelle die Funktion, die zwei Seitenlängen a und b als Parameter vom Typ Double erhält
und die dritte Seitenlänge c vom Typ Double als Rückgabewert zurückgibt.
3. berechne im Rumpf der Funktion die dritte Seitenlänge c mit der Formel in der Aufgabenstellung.
4. Gib das Ergebnis zurück.
5. Prüfe deine Funktion, indem du sie in der main()-Funktion mit den Werten 4.2 und 6.5 aufrufst und das
Ergebnis in der Konsole ausgibst. Wird in etwa 7.73 ausgegeben?  
   (Das Ergebnis kann sich bei verschiedenen Computern ein kleines bisschen unterscheiden,
   deswegen vergleichen wir nur bis zur 2. Nachkommastelle)
6. Prüfe deine Funktion ebenfalls mit den Werten 12.56 und 3.56. Kommt in etwa 13.05 raus?

**Modul für die Aufgabe:** *Aufgabe7*  
**Datei für die Aufgabe:** *SeitenlaengeEinesDreiecks.kt*


</details>


