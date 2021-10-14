package com.sahraer.bootcamptekrarhepsiburada.bilgiyarismasi.data.model

data class Question(val question:String,
                    val answers:ArrayList<Answer>,
                    val correntAnswer:String)  // data class nedir -dataya eklenen kısımlar eklenebilir

{
    fun countAnswer() : Int{
        return answers.count()
    }
}

