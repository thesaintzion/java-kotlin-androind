package com.lekkiforum.cashcoin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityMenuPage: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_page)

         //Initialise functions...
        this.showToast("Welcome to menu page...")
    }

//Toast function
    private fun showToast(message: String){
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}
}