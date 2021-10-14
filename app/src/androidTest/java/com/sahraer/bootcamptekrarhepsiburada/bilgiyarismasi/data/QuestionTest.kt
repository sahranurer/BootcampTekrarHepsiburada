package com.sahraer.bootcamptekrarhepsiburada.bilgiyarismasi.data

import com.sahraer.bootcamptekrarhepsiburada.bilgiyarismasi.data.model.Answer
import com.sahraer.bootcamptekrarhepsiburada.bilgiyarismasi.data.model.Question
import org.junit.Assert.assertTrue
import org.junit.Test

class QuestionTest {
    val question = Question(question = "İstanbul plakası nedir ?",
        answers = arrayListOf(
            Answer(type = "A",answer = "34"),
            Answer(type = "B",answer = "35") ,
            Answer(type = "C",answer = "36"),
            Answer(type = "D",answer = "37")
        ),
        correntAnswer = "C")
    /*

     Burada doğru cevap C şıkkı - Answer data classından şıkları tanımladık
     */
    @Test
    fun questionTest(){

        //doğru işlem
        assertTrue(question.correntAnswer == "C")
        //yanlış cevap
        assertTrue(question.correntAnswer == "A")
        assertTrue(question.correntAnswer == "B")
        assertTrue(question.correntAnswer == "D")
    }

    @Test
    fun countAnswer(){
        //doğru işlem
        assertTrue(question.countAnswer() == 4)
        //yanlış cevap
        assertTrue(question.countAnswer() == 2)
    }





}