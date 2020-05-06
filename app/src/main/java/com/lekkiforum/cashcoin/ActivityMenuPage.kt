package com.lekkiforum.cashcoin

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_menu_page.*

class ActivityMenuPage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_page)


        //    Animate logo on create...
iv_logo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_in))

        //Initialise functions...
        // this.showToast("Welcome to menu page...")
    }

//Toast function
    private fun showToast(message: String){
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

}