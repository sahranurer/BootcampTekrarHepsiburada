package com.sahraer.bootcamptekrarhepsiburada.bilgiyarismasi.question

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import com.sahraer.bootcamptekrarhepsiburada.R
import com.sahraer.bootcamptekrarhepsiburada.bilgiyarismasi.data.CampHelper
import com.sahraer.bootcamptekrarhepsiburada.bilgiyarismasi.data.model.Answer
import com.sahraer.bootcamptekrarhepsiburada.bilgiyarismasi.data.model.Question

class AddNewQuestionsActivity : AppCompatActivity() {

    private val editTextQuestion by lazy { findViewById<EditText>(R.id.edit_text_question) }
    private val edittext_a by lazy { findViewById<EditText>(R.id.editText_a) }
    private val edittext_b by lazy { findViewById<EditText>(R.id.editText_b) }
    private val edittext_c by lazy { findViewById<EditText>(R.id.editText_c) }
    private val edittext_d by lazy { findViewById<EditText>(R.id.editText_d) }
    private val radioGroup by lazy { findViewById<RadioGroup>(R.id.radioGroup) }
    private val button_save by lazy { findViewById<Button>(R.id.button_kaydet) }

    private var secilenCevap:String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_new_questions)

        button_save.setOnClickListener {
             if (isValid()){
                 save()
             }
        }

        radioGroup.setOnCheckedChangeListener { radioGroup,i -> // şseçilen şıkkı kotrol etme işlemi
          secilenCevap = when(i){
                R.id.radioButton_a -> 'a'.toString()
                R.id.radioButton_b -> 'b'.toString()
                R.id.radioButton_c -> 'c'.toString()
                R.id.radioButton_d -> 'd'.toString()
                else -> null
            }

            Log.d("AddNewQuestionsActivity","seçilen şık : $secilenCevap")

        }

    }

    //yazılan metotlar bir iş yapmalıdır önemli !!!

    private fun save() {
        Log.e("AddNewQuestionsActivity","Bu form kaydedilebilir")
        val question = Question(question = editTextQuestion.text.toString(),
            answers = arrayListOf(
                Answer(type = "A",answer = edittext_a.text.toString()),
                Answer(type = "B",answer = edittext_b.text.toString()) ,
                Answer(type = "C",answer = edittext_c.text.toString()),
                Answer(type = "D",answer = edittext_d.text.toString())
            ),
            correntAnswer = secilenCevap  ?: "")
        CampHelper.list.add(question) // kaydedilen veri CampHelper listesine eklenmiş olucak
        finish()
    }

    fun EditText.isValid() :Boolean{
        if (text.isNullOrEmpty()){
            requestFocus()
            editTextQuestion.error = "Bu alan gereklidir"
        }
        return text.isNotEmpty()
    }

    private fun isValid():Boolean { // bu metot ile formun dolu boş kontrolü sağlanıyor

        var isValid:Boolean


        isValid = editTextQuestion.isValid()
        isValid = edittext_a.isValid()
        isValid = edittext_b.isValid()
        isValid = edittext_c.isValid()
        isValid = edittext_d.isValid()

        if (secilenCevap.isNullOrEmpty()){ // radioGroup seçildi mi kontrolu
            Toast.makeText(this,"Şıklardan birini seçmek zorundasınız",Toast.LENGTH_SHORT).show()
            isValid = false
        }

       return isValid

    }
}


