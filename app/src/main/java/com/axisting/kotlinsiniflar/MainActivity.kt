package com.axisting.kotlinsiniflar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val volkan : Person = Person (20 , "Volkan", "Bilgisayar Mühendisi")
        System.out.println(volkan.age)
        volkan.hairColor = "Black"

        System.out.println("Nullability------------------------------")
        var myString : String? = null
        System.out.println (myString)

        var myAge : Int? = 20 // null yazabiliriz ama

        System.out.println(myAge!! * 20) // burada derlenirken hata verir.

        System.out.println("Erişilebilirlik seviyeleri ------------------------------")
        var myNumber : Int? = null
        if (myNumber != null) {
            System.out.println (myNumber*10)
        }else {
            System.out.println("myNumber is null")
        }

        System.out.println(myNumber?.compareTo(2))

        val myResult =myNumber?.compareTo(2)?: -100
        System.out.println(myResult)



    }
}
