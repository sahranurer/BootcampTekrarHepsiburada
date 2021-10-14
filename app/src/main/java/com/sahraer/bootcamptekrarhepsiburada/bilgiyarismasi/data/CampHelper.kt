package com.sahraer.bootcamptekrarhepsiburada.bilgiyarismasi.data

import com.sahraer.bootcamptekrarhepsiburada.bilgiyarismasi.data.model.Answer
import com.sahraer.bootcamptekrarhepsiburada.bilgiyarismasi.data.model.Question

object CampHelper {

    val list = arrayListOf(Question(
        question = "İstanbul plakası nedir ?",
        answers = arrayListOf(
        Answer(type = "A",answer = "34"),
        Answer(type = "B",answer = "35") ,
        Answer(type = "C",answer = "36"),
        Answer(type = "D",answer = "37")
    ),
    correntAnswer = "C"))




}