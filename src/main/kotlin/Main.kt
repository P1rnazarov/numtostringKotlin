import netscape.javascript.JSObject
import java.io.File

fun main(args: Array<String>) {
    val output = File("output.txt")
    output.writeText("")
    val numNames = arrayOf("hazor", "million", "milliard", "trillion", "kvadrillion", "kvintillion")

    val numtostr: numToStr = numToStr()
    var arr: Array<String> = arrayOf()
    var num = "001234567887655434"
    val numSize = num.length
    println(numSize)

    if (numSize.equals(21)) {
        print(numtostr.convert(num.substring(0, 3).toInt()))
        print(" kvintillion")
        if (num.substring(3, 6).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(3, 6).toInt()))
            print(" kvadrillion")
        }
        if (num.substring(6, 9).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(6, 9).toInt()))
            print(" trillion")
        }
        if (num.substring(9, 12).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(9, 12).toInt()))
            print(" milliard")
        }
        if (num.substring(12, 15).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(12, 15).toInt()))
            print(" million")
        }
        if (num.substring(15, 18).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(15, 18).toInt()))
            print(" hazor")
        }
        if (num.substring(18, 21).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(18, 21).toInt()))
        }
    }
    if (numSize.equals(18)) {
        print(numtostr.convert(num.substring(0, 3).toInt()))
        print(" kvadrillion")
        if (num.substring(3, 6).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(3, 6).toInt()))
            print(" trillion")
        }
        if (num.substring(6, 9).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(6, 9).toInt()))
            print(" milliard")
        }
        if (num.substring(9, 12).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(9, 12).toInt()))
            print(" million")
        }
        if (num.substring(12, 15).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(12, 15).toInt()))
            print(" hazor")
        }
        if (num.substring(15, 18).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(15, 18).toInt()))
        }
    }
    if (numSize.equals(15)) {
        print(numtostr.convert(num.substring(0, 3).toInt()))
        print(" trillion")
        if (num.substring(3, 6).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(3, 6).toInt()))
            print(" milliard")
        }
        if (num.substring(6, 9).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(6, 9).toInt()))
            print(" million")
        }
        if (num.substring(9, 12).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(9, 12).toInt()))
            print(" hazor")
        }
        if (num.substring(12, 15).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(12, 15).toInt()))
        }
    }
    if (numSize.equals(12)) {
        print(numtostr.convert(num.substring(0, 3).toInt()))
        print(" milliard")
        if (num.substring(3, 6).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(3, 6).toInt()))
            print(" million")
        }
        if (num.substring(6, 9).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(6, 9).toInt()))
            print(" hazor")
        }
        if (num.substring(9, 12).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(9, 12).toInt()))
        }
    }
    if (numSize.equals(9)) {
        print(numtostr.convert(num.substring(0, 3).toInt()))
        print(" million")
        if (num.substring(3, 6).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(3, 6).toInt()))
            print(" hazor")
        }
        if (num.substring(6, 9).toInt() > 0) {
            print("u " + numtostr.convert(num.substring(6, 9).toInt()))
        }
    }
    if (numSize.equals(6)) {
        print(numtostr.convert(num.substring(0, 3).toInt()))
        print(" hazor")
        if (num.substring(3, num.length).toInt() > 0) {
            println("u " + numtostr.convert(num.substring(3, num.length).toInt()))
        }
    }
    if(numSize.equals(3)){
        println(numtostr.convert(num.substring(0, 3).toInt()))
    }


}