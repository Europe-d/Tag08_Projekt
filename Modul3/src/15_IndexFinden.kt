fun main() {
    /*
    An welcher Stelle in der Liste befindet sich der Name "Pam"?
     Erstelle eine neue Variable und teile dieser dann den Index zu.
     Benutze dafür die in der Vorlesung vorgestelle Methode.
     */
    var names: MutableList<String> = mutableListOf("Jim", "Angela", "Oscar", "Pam", "Dwight")

    /* hier finden wir auf den stelle  3 die name "Pam"  wenn ich habe richtig verstanden auf deutsch muss ich
    in der stelle von pal  einfach index schreiben */

var index : Int = names.indexOf("Pam")
println(index)

    //TODO füge hier deinen Code ein
}