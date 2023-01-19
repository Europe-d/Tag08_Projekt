fun main() {
    /*
    Wir wollen in dieser Aufgabe eine Liste von Strings in eine logische Reihenfolge bringen.
    Beispiel: Eine Liste ["X", "A", "U", "D"] soll am Ende so aussehen: ["A", "D", "U", "X"].
    Erstellt eine neue Variable, in der ihr die neue Liste speichert.
    Benutze dafür die in der Vorlesung vorgestelle Methode.
     */
    var unsortedList: MutableList<String> = mutableListOf( "Quentin","Christopher", "Steven","Alfred", "David" )

  //unsortedList.sort()
    //println(unsortedList)

    /*oder auf neue liste  sortieren machen dann. */

    var sortedList = unsortedList.sorted()
    print(sortedList)
    //TODO füge hier deinen Code ein
}