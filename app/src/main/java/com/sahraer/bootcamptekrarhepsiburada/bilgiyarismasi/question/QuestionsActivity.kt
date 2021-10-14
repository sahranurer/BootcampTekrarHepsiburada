package com.sahraer.bootcamptekrarhepsiburada.bilgiyarismasi.question

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sahraer.bootcamptekrarhepsiburada.R
import com.sahraer.bootcamptekrarhepsiburada.bilgiyarismasi.data.CampHelper

class QuestionsActivity : AppCompatActivity() {

    private val fab by lazy{findViewById<View>(R.id.fab)}
    private val recyclerViewQuestion by lazy {findViewById<RecyclerView>(R.id.recycler_view_question)}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        fab.setOnClickListener {
            startActivity(Intent(this,AddNewQuestionsActivity::class.java))
        }

        Log.d("QuestionsActivity","onCreate()")

        initQuestions()





    }

    private fun bindQuestions() { // görünüm ayarlama işlemi
        recyclerViewQuestion.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }

    private fun initQuestions() { //list adaptera verilme işlemi
        recyclerViewQuestion.adapter = QuestionAdapter(CampHelper.list)
    }

    //activity lifecycle
    override fun onResume() {
        super.onResume()
        bindQuestions()
    Log.d("QuestionsActivity","onResume()")
    Log.d("QuestionsActivity","List:${CampHelper.list.size}")

    }

    override fun onStart() {
        super.onStart()
        Log.d("QuestionsActivity","onStart()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("QuestionsActivity","onPause()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("QuestionsActivity","onDestroy()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("QuestionsActivity","onStop()")
    }


}


