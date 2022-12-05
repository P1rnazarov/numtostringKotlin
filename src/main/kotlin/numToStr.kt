import java.io.File

class numToStr {
    fun convert(n: Int):String {
        val output = File("output.txt")
        var s=""
        var an1 = arrayOf("", "Yak", "Du", "Se", "Chor", "Panj", "Shish", "Haft", "Hasht", "Nu")
        var an2 = arrayOf("Dah", "Bist", "Si", "Chil", "Panjo", "Shast", "Haftod", "Hashtod", "Navad")
        var an_10 =
            arrayOf("Dah", "Yozda", "Duvozda", "Senzda", "Chorda", "Ponzda", "Shonzda", "Habda", "Hashda", "Nuzda")
        var n1 = n / 100
        var n2 = n / 10 % 10
        var n3 = n % 10
        if (n.toInt() == 0) {
            s+=("")
            return s
        }
        if (n > 99) {
            s+=(an1[n1.toInt()] + " Sad")
        }
        if (n > 100 && (n%100).toInt() !=0) s+=("u ")
        if (n2 > 1) {
            s+=(an2[(n2 - 1).toInt()])
            if (n3 > 0) {
                s+=("u " + an1[n3.toInt()])
            }
        }
        //if(n>10) print("u ")
        if (n2.toInt() == 0) {
            s+=(an1[n3.toInt()])
        }
        if (n2.toInt() == 1 && n3 >= 0) {
            s+=(an_10[n3.toInt()])
        }
        s+=""
        //print(s)
        output.writeText(output.readText()+s)
        return s
    }
}
