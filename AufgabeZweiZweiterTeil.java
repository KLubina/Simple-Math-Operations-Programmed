Aufgabe 2: Implementiere die Multiplikation, indem du nur Addition und eine For Schleife verwendest. Kommentiere deine Lösung.

package ram;

public class Multiplikation {
    public static void main(String[] args) {
        // Initialisiere die int Variablen x mit 14 und y mit 42
        int x = 14;
        int y = 42;

        // Rufe die Multiplikationsmethode auf
        int ergebnis = multipliziere(x, y);

        // Gib das Ergebnis auf der Konsole aus
        System.out.println("Multiplikation: " + ergebnis);
    }

    // Multiplikationsmethode mit Addition und For-Schleife
    static int multipliziere(int a, int b) {
        // Initialisiere das Ergebnis als 0
        int ergebnis = 0;

        // Führe die Addition b Mal durch
        for (int i = 0; i < b; i++) {
            // Addiere a zu dem bisherigen Ergebnis
            ergebnis = ergebnis + a;
        }

        // Gib das Endergebnis zurück
        return ergebnis;
    }
}
