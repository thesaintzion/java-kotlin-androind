package com.lekkiforum.cashcoin

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
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


       // Intent button
        continueBtn.setOnClickListener{
            var route = Intent(this, ActivityMenuPage::class.java)
            startActivity(route)
      // Toast.makeText(this, "Username Saint", Toast.LENGTH_LONG).show()

        }

//   Animation splash screen
        continueBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_in))
        tv_logo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_in))

        Handler().postDelayed({
            tv_logo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_out))
            continueBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_out))
            Handler().postDelayed({
            tv_logo.visibility; continueBtn.visibility  = View.GONE
            startActivity(Intent(this, ActivityMenuPage::class.java))
       finish()
        }, 1000)
        }, 3000)

    }

//    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
//    override fun onResume() {
//        super.onResume()
//
//        continueBtn.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_in))
//        tv_logo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_in))
//         Toast.makeText(this, "Welcome back", Toast.LENGTH_LONG).show()
//
//    }


}
