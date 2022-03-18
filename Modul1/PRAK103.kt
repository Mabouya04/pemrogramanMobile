package Modul1

import java.util.*

fun main() {
    val input = Scanner(System.`in`)

    var bil = input.nextInt()
    var kelipatan = bil
    repeat(7){
        bil += kelipatan

        if(bil % 2 == 0 || bil % 3 == 0){
            print("$bil ")
        }
    }

}