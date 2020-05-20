package com.lekkiforum.cashcoin

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class ActivityMenuPage: AppCompatActivity() {


    lateinit var rollDiceLink: LinearLayout
    lateinit var todoAppLink: LinearLayout
    lateinit var yogaReminderLink: LinearLayout
    lateinit var romanConverterLink: LinearLayout
    lateinit var logo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_page)

            // Init views
            rollDiceLink = findViewById(R.id.ll_roll_dice)
            todoAppLink = findViewById(R.id.ll_todo_app)
            yogaReminderLink = findViewById(R.id.ll_yoga_remind)
            romanConverterLink = findViewById(R.id.ll_roman_app)
            logo = findViewById(R.id.iv_logo)


        //    Animate logo on create...
          logo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_in))

        //==== Routes ==== //
            rollDiceLink.setOnClickListener {
                startActivity(Intent(this, DiceRollActivity::class.java))
            }

            todoAppLink.setOnClickListener {
                startActivity(Intent(this, ActivityTodoApp::class.java))
            }

            yogaReminderLink.setOnClickListener{
                Toast.makeText(this, "Reminder App", Toast.LENGTH_LONG).show()
            }

            romanConverterLink.setOnClickListener {
                startActivity(Intent(this, ActivityRomanConverter::class.java))
            }



    }


//Toast function
    private fun showToast(message: String){
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}


}
