package com.sahraer.bootcamptekrarhepsiburada

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.sahraer.bootcamptekrarhepsiburada.bilgiyarismasi.model.QuestionsActivity

class MainActivity : AppCompatActivity() {
    val buttonQuestions by lazy {findViewById<View>(R.id.button_questions)}
    //Button yerine View yazmamız performans açısından daha iyi



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonQuestions.setOnClickListener {
            val intent = Intent(this, QuestionsActivity::class.java)
            startActivity(intent)
            //veri aktarımı
            intent.putExtra("name","deniyoruz")
            finish() //önceki sayfayı görmek istemiyorsak login sayfasında geri gitmemek gibi
        }


        //Loglama İşlemleri
        val sayi = "123absg".inteCevir()
        Log.i("denemetest","sayi : ${sayi}")
        try{
            if(sayi % 2 == 0){
                Log.d("test çift","sayi çift")
            }else{
                Log.d("test tek","sayi tek")
            }

        }catch (ex:Exception){
            Log.e("test","yanlışlık var")
        }


    }
}

fun String.inteCevir() = this.toIntOrNull() ?: 0