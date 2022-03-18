package Modul1

import java.util.*
import kotlin.system.exitProcess



    val input = Scanner(System.`in`)
    var nama = ""
fun main() {
    var i :Int
    print("Masukkan nama : ")
    nama = input.nextLine()
    println("Selamat datang $nama")
    do {
        println("silahkan Pilih menu berikut : ")
        println("1. Komputer")
        println("2. Laptop")
        println("3. Android")
        println("4. exit")
        i = input.nextInt()

        if(i == 1){
            komputer()
        }else if( i == 2){
            laptop()
        }else if( i == 3){
            android()
        }else if (i == 4){
            exitProcess(1)
        }
    }while (i < 5)

}

fun komputer(){
    println("$nama sedang bermain komputer")
}

fun laptop(){
    println("$nama sedang membersihkan Laptop")
}

fun android(){
    println("$nama Sedang mendevelop Android")
}