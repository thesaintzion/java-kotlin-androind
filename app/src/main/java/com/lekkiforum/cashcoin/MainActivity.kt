package com.lekkiforum.cashcoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Added a click event to a btn
//        submitBtn.setOnClickListener {
//            Toast.makeText(this, "Username Saint", Toast.LENGTH_LONG).show()
//        }

// Routes
//        continueBtn.setOnClickListener {
//            var continueRoute = Intent (this, CalculatorActivity::class.java)
//            startActivity(continueRoute)
//            Toast.makeText(this, "Welcome Home", Toast.LENGTH_LONG).show()
//        }

        continueBtn.setOnClickListener{
            var route = Intent(this, ActivityDashboard::class.java)
            startActivity(route)
//            Toast.makeText(this, "Username Saint", Toast.LENGTH_LONG).show()

        }
    }


}
