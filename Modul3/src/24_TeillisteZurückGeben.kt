fun main(){


    var bestenListe = listOf("Lisa", "Marko", "Sebastian", "Marie", "Florian", "Henrik", "Lillie", "Martin")

    var nummer1 : Int = readln().toInt()
    var nummer2: Int = readln().toInt()

    var teiliste = bestenListe.slice(nummer1..nummer2)
    println(teiliste)




    // TODO : Schreibe eine main Funktion die zwei Zahlen als Eingaben vom Benutzer entgegennimmt.


    // TODO : Die zwei Eingaben sollen als Idizes gewertet und für Anfang und Ende einer Teilliste der bestenListe stehen.(erstelle diese Teilliste) Tipp : <Listenname>.slice() .
    // TODO : Die Teilliste soll über einen println() befehl ausgegeben werden.



}