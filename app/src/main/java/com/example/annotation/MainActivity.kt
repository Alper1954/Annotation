package com.example.annotation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


//import kotlin.reflect.full.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item1 = Item(amount = 1.0f, name = "Bob")
        var validator = Validator()
        Log.i("alain","validity instance item1: ${validator.isValid(item1)}" )

        val item2 = Item(amount = -2.0f, name = "Bob")
        validator = Validator()
        Log.i("alain","validity instance item2: ${validator.isValid(item2)}" )

        val item3 = Item(amount = 1.0f, name = "Lulu")
        validator = Validator()
        Log.i("alain","validity instance item3: ${validator.isValid(item3)}" )
    }
}