package com.lekkiforum.cashcoin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculator.*


class CalculatorActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Toast.makeText(this,"Welcome Back Home", Toast.LENGTH_LONG).show()


        val number1: TextView = tv_number1
         val number2: TextView  = tv_number2
         val calculate: Button = bt_calculate
        val result  = tv_result

//   lets see
        number1.setOnClickListener {
//            result.text =
            Toast.makeText(this, number1.text, Toast.LENGTH_LONG).show()
        }

//
        calculate.setOnClickListener {
            if(number1.text.isEmpty() || number2.text.isEmpty()){
                Toast.makeText(this,"Please fill in the fields.", Toast.LENGTH_LONG).show()
            }else{
             //Proceed the ap
                var number2Text: String =  number2.text.toString().trim()
                var  resultText =  Integer.parseInt(number2Text)
                resultText++
                result.text =  resultText.toString()
            }
        }


    }







}