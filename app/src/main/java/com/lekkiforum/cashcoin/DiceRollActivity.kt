package com.lekkiforum.cashcoin

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.dice_roll_activity.*

class DiceRollActivity: AppCompatActivity() {
    //Late init views...
    private lateinit var rollDiceResult1: TextView
    private lateinit var rollDiceResult2: TextView
    private lateinit var rollDiceTotal: TextView
    private lateinit var rollDiceBtn: Button
    private lateinit var rollDiceImg1: ImageView
    private lateinit var rollDiceImg2: ImageView
    private lateinit var mainContainer: RelativeLayout


    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
        setContentView(R.layout.dice_roll_activity)

//        Assign values to late init..
        rollDiceResult1 = findViewById(R.id.tv_dice_result_1)
        rollDiceResult2 = findViewById(R.id.tv_dice_result_2)
        rollDiceTotal =  findViewById(R.id.tv_dice_total)
        rollDiceBtn = findViewById(R.id.bt_dice_btn)
        rollDiceImg1 = findViewById(R.id.iv_dice_img)
        rollDiceImg2 = findViewById(R.id.iv_dice_img_2)
        mainContainer = findViewById(R.id.main)


//        Init activity toolbar and properties
        setSupportActionBar(dice_toolbar)
        this.title = "Roll Dice"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

//        Set click listener to roll dice button
        this.rollDiceBtn.setOnClickListener{this.handleRollDice()}


        mainContainer.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_in))

    }


    private fun handleRollDice(){
        val randomInt1 = (1..6).random()
        val randomInt2 = (1..6).random()
        var addBoth = randomInt1 + randomInt2
        if(this.rollDiceTotal.text == "Total"){
            this.rollDiceTotal.text =  addBoth.toString()
        }else{
            val textToInt =  this.rollDiceTotal.text.toString().toInt()+addBoth
            this.rollDiceTotal.text = textToInt.toString()
        }
        this.rollDiceResult1.text = randomInt1.toString()
        this.rollDiceResult2.text = randomInt2.toString()

        this.setDiceImage(randomInt1, randomInt2)
//        Toast.makeText(this, "Handle", Toast.LENGTH_LONG).show()
    }

    private fun setDiceImage(randomInt1: Int, randomInt2: Int){

        when (randomInt1) {
            1 -> {
                this.rollDiceImg1.setImageResource(R.drawable.dice_1)
            }
            2 -> {
                this.rollDiceImg1.setImageResource(R.drawable.dice_2)
            }
            3 -> {
                this.rollDiceImg1.setImageResource(R.drawable.dice_3)
            }
            4 -> {
                this.rollDiceImg1.setImageResource(R.drawable.dice_4)
            }
            5 -> {
                this.rollDiceImg1.setImageResource(R.drawable.dice_5)
            }
            6 -> {
                this.rollDiceImg1.setImageResource(R.drawable.dice_6)
            }
        }
        when (randomInt2) {
            1 -> {
                this.rollDiceImg2.setImageResource(R.drawable.dice_1)
            }
            2 -> {
                this.rollDiceImg2.setImageResource(R.drawable.dice_2)
            }
            3 -> {
                this.rollDiceImg2.setImageResource(R.drawable.dice_3)
            }
            4 -> {
                this.rollDiceImg2.setImageResource(R.drawable.dice_4)
            }
            5 -> {
                this.rollDiceImg2.setImageResource(R.drawable.dice_5)
            }
            6 -> {
                this.rollDiceImg2.setImageResource(R.drawable.dice_6)
            }
        }

        rollDiceImg1.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_in))
        rollDiceImg2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_in))


    }


}

