package Modul1

import java.util.Scanner

fun main(args: Array<String>) {
    val waktu : String
    val nama : String
    val umur : Int
    val suhu : Float


    val input = Scanner(System.`in`)

    print("Waktu Sekarang : " )
    waktu = input.nextLine()
    print("Nama Anda : ")
    nama = input.nextLine()
    print("Umur Anda : ")
    umur = input.nextInt()
    print("Suhu Tubuh Anda : ")
    suhu = input.nextFloat()


    println("Selamat $waktu, $nama.")
    println("Umur anda $umur Tahun.")
    println("Suhu Tubuh anda $suhu derajat Celcius.")

}