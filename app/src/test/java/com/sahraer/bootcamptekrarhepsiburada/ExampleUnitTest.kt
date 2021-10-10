package com.sahraer.bootcamptekrarhepsiburada

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun inteCevir_isCorrect(){
        //başarılı senaryo kontrolü
        assertEquals(0,"deneme".inteCevir())
        assertEquals(12,"123".inteCevir())

        //bu şekilde daha sağlıklı
        //başarısız senaryo kontrolü
        assertTrue("deneme".inteCevir() == 1 )
        assertTrue("123".inteCevir() == 123 )
        assertTrue("10".inteCevir() == 11 )

    }
}