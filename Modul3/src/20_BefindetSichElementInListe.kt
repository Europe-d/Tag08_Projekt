fun main() {
    /*
        Wir haben eine Liste mit Namen und wollen wissen, ob sich der Name "Walter" in der Liste befindet.
        Erstelle eine neue Boolean-Variable, die uns zeigt, ob sich der Name in der Liste befindet.
        Benutze dafür die in der Vorlesung vorgestelle Methode.
     */
    var names: MutableList<String> = mutableListOf("Jimmy", "Hank", "Jesse", "Walter", "Marie", "Skyler")


    //TODO füge hier deinen Code ein
/* ich habe auch mit boolean gemacht und so gelassen aber wenn das progrmam selbst anschaeun muss ich auf die weter
loschung denken mit isEmpty */

      var namesdazu : Boolean = names.contains("Walter")
      println("ja in der liste $names finden wir das name Walter ist $namesdazu")

    /* das ich denke funktioniert nicht weil gibt auf die liste der name und er sagt ist false */
    //println("befinden der name auf die liste: ${names.isEmpty()}")




}