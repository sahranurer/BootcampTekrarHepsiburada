package com.sahraer.bootcamptekrarhepsiburada.bilgiyarismasi.model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.sahraer.bootcamptekrarhepsiburada.R

class QuestionsActivity : AppCompatActivity() {

    private val fab by lazy{findViewById<View>(R.id.fab)}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        fab.setOnClickListener {
            startActivity(Intent(this,AddNewQuestionsActivity::class.java))
        }


    }
}