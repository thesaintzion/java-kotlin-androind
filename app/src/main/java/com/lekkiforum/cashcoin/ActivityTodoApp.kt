package com.lekkiforum.cashcoin

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_todo_app.*

class ActivityTodoApp:  AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo_app)
      setSupportActionBar(todo_toolbar)
        title = "Todo App"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)


        fb_add_btn.setOnClickListener{
            if(container.isVisible){
                container.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_out))
                container.visibility = View.GONE

            }else{
                container.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_in))
                container.visibility = View.VISIBLE
            }

            Toast.makeText(this, "add more todo", Toast.LENGTH_LONG).show()
        }


    }

}
