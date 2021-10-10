package com.sahraer.bootcamptekrarhepsiburada.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sahraer.bootcamptekrarhepsiburada.R
class Kotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun main(args:Array<String>){

    println("Hoşgeldiniz ! ")

    //variable değişken demek

    val sayi1 = 1 // val-ue:değiştirilemez mtable
    val sayi2:Int = 2
    var text = "" // var-mutable değiştirilir

    // null -safety ?,!!
    //null olabilir dersek ? kullanırız
    val sayi3:Int? = 2

    var text2:Boolean = false
    if (text2){

    }else{

    }

    val list = arrayListOf(1,2,3)
    val list2:ArrayList<Int> = arrayListOf(1,2,3)

    for (i in list){
        print("item" + i )
    }

    for (j in list){
        print("item ${j.toDouble()} ")
    }

    //tüm elemanların tek tek dolaşılması
    list.forEach {
        print("item ${it.toDouble()} ")
    }
    list.forEach { number ->
        print("item ${number.toDouble()} ")
    }

    (1..10 step 2).forEach { number ->
        print("item ${number.toDouble()} ")
    }

    (0 until 10).filter {
        it%3!== 0 //filtreleme işlemi ile
    }.forEach { number -> //10 dahil değil
        print("item : $number")

    }

   println("count: ${(1..10).count()}") //dizi uzunluğum kaç

    //scope function
    val isValid:Boolean? = true

    isValid.let {
        print("null değil")
    }

    val isDivide:Boolean? = isDivideTwo(12)

    isDivide.let {
        print("bölünme durumu : $it")
    }


}

fun isDivideTwo(i: Int): Boolean? { // fonk geri dönüşü boolean
    if (i < 0){
        return null
    }
    return i%2 == 0


}
