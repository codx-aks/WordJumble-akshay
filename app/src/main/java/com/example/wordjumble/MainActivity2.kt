package com.example.wordjumble




import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


@Suppress("NAME_SHADOWING")
class MainActivity2 : AppCompatActivity() {



    private lateinit var hss:TextView

    private lateinit var sf:SharedPreferences
    private lateinit var editor:SharedPreferences.Editor








    private fun resetting(u:Button) {
        u.isEnabled=true
        u.setBackgroundResource(R.drawable.grid)
        u.alpha = 0.70F
        u.setTextColor(Color.parseColor("#2E3133"))

    }
    @SuppressLint("MissingInflatedId", "SetTextI18n", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val info: ImageButton = findViewById(R.id.info)
        val word = intent.getStringExtra("word")
        val clue = intent.getStringExtra("clue")
        var highscore=intent.getStringExtra("highscore")

        val cluebox: TextView = findViewById(R.id.cluebox)
        val cluetop: TextView = findViewById(R.id.cluetop)
        val okay: Button = findViewById(R.id.okay)
        val bg: ConstraintLayout=findViewById(R.id.bg)
        val h1:ImageView=findViewById(R.id.heart1)
        val h2:ImageView=findViewById(R.id.heart2)
        val h3:ImageView=findViewById(R.id.heart3)
        val reset:Button=findViewById(R.id.reset)
        val check: Button = findViewById(R.id.check)
        val answer: TextView = findViewById(R.id.answer)

        sf=getSharedPreferences("my_sf", MODE_PRIVATE)
        editor=sf.edit()
        cluebox.text = clue.toString()
        var alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            var num = mutableListOf<Int>()
            var text= mutableListOf(' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ')
            var i=0
        var score=" "
        var a=0
        var c=0
        var d=0
        var h=0
        if (word != null) {
            while (word.length > i) {
                a = (0..15).random()
                if (a in num) {
                    continue
                } else {
                    num.add(a)
                    text[a] = word[i]
                    i += 1
                }
            }
        }
            while(i<16){
                 c=(0..15).random()
                 d=(0..25).random()
                if(c in num){
                    continue
                }
                else{
                    num.add(c)
                    text[c]=alpha[d]
                    i += 1
                }
            }
        val g1:Button=findViewById(R.id.g1)
        val g2:Button=findViewById(R.id.g2)
        val g3:Button=findViewById(R.id.g3)
        val g4:Button=findViewById(R.id.g4)
        val g5:Button=findViewById(R.id.g5)
        val g6:Button=findViewById(R.id.g6)
        val g7:Button=findViewById(R.id.g7)
        val g8:Button=findViewById(R.id.g8)
        val g9:Button=findViewById(R.id.g9)
        val g10:Button=findViewById(R.id.g10)
        val g11 =findViewById<Button>(R.id.g11)
        val g12:Button=findViewById(R.id.g12)
        val g13:Button=findViewById(R.id.g13)
        val g14:Button=findViewById(R.id.g14)
        val g15:Button=findViewById(R.id.g15)
        val g16:Button=findViewById(R.id.g16)
        g1.text=text[0].toString()
        g2.text=text[1].toString()
        g3.text=text[2].toString()
        g4.text=text[3].toString()
        g5.text=text[4].toString()
        g6.text=text[5].toString()
        g7.text=text[6].toString()
        g8.text=text[7].toString()
        g9.text=text[8].toString()
        g10.text=text[9].toString()
        g11.text=text[10].toString()
        g12.text=text[11].toString()
        g13.text=text[12].toString()
        g14.text=text[13].toString()
        g15.text=text[14].toString()
        g16.text=text[15].toString()
        check.isEnabled=false
        info.setOnClickListener {
            cluebox.visibility = View.VISIBLE
            cluetop.visibility = View.VISIBLE
            okay.visibility = View.VISIBLE
            g1.visibility = View.INVISIBLE
            g2.visibility = View.INVISIBLE
            g3.visibility = View.INVISIBLE
            g4.visibility = View.INVISIBLE
            g5.visibility = View.INVISIBLE
            g6.visibility = View.INVISIBLE
            g7.visibility = View.INVISIBLE
            g8.visibility = View.INVISIBLE
            bg.setBackgroundResource(R.drawable.bgfad)
            g9.alpha=0.43F
            g10.alpha=0.43F
            g11.alpha=0.43F
            g12.alpha=0.43F
            g13.alpha=0.43F
            g14.alpha=0.43F
            g15.alpha=0.43F
            g16.alpha=0.43F
            h1.alpha=0.43F
            h2.alpha=0.43F
            h3.alpha=0.43F
            info.alpha=0.43F
            reset.alpha=0.43F
            check.alpha=0.43F
            answer.alpha=0.05F
            okay.setOnClickListener {
                cluebox.visibility = View.INVISIBLE
                cluetop.visibility = View.INVISIBLE
                okay.visibility = View.INVISIBLE
                bg.setBackgroundResource(R.drawable.screenshot_2023_05_13_at_3_24_31_pm)
                g1.visibility = View.VISIBLE
                g2.visibility = View.VISIBLE
                g3.visibility = View.VISIBLE
                g4.visibility = View.VISIBLE
                g5.visibility = View.VISIBLE
                g6.visibility = View.VISIBLE
                g7.visibility = View.VISIBLE
                g8.visibility = View.VISIBLE
                g9.alpha=0.70F
                g10.alpha=0.70F
                g11.alpha=0.70F
                g12.alpha=0.70F
                g13.alpha=0.70F
                g14.alpha=0.70F
                g15.alpha=0.70F
                g16.alpha=0.70F
                h1.alpha=1.00F
                h2.alpha=1.00F
                h3.alpha=1.00F
                info.alpha=1.00F
                reset.alpha=1.00F
                check.alpha=1.00F
                answer.alpha=0.30F
            }
        }
        var s1=""
        var e=0
        var life=3
        var n=""
           fun app(){
               var count=0
            n=""
            if (word != null) {
                while (e < word.length) {
                    s1 += "_ "
                    e += 1
                }
            }
            answer.text = s1
            val s = 48 - (word?.length ?: 10) * 1.5
            answer.textSize = s.toFloat()
            var f=0
            @SuppressLint("SuspiciousIndentation")
            fun grid(u:Button){
               if(f!=0) {
                   answer.text = answer.text.substring(0, f) + u.text.toString() + answer.text.substring(f + 1)
                   n = n + u.text
               }
                else{
                   answer.text = u.text.toString() + answer.text.substring(1)
                   n = n + u.text
               }
            f += 2
count=count+1
                u.setBackgroundResource(R.drawable.answer)
                u.alpha = 0.30F
                u.setTextColor(Color.WHITE)
                u.isEnabled = false
if(count== word !!.length){
    g1.isEnabled = false
    g2.isEnabled = false
    g3.isEnabled = false
    g4.isEnabled = false
    g5.isEnabled = false
    g6.isEnabled = false
    g7.isEnabled = false
    g8.isEnabled = false
    g9.isEnabled = false
    g10.isEnabled = false
    g11.isEnabled = false
    g12.isEnabled = false
    g13.isEnabled = false
    g14.isEnabled = false
    g15.isEnabled = false
    g16.isEnabled = false
    check.isEnabled=true
        }}
                g1.setOnClickListener {
                    grid(g1)
                }
                g2.setOnClickListener {
                    grid(g2)
                }
                g3.setOnClickListener {
                    grid(g3)
                }
                g4.setOnClickListener {
                    grid(g4)
                }
                g5.setOnClickListener {
                    grid(g5)
                }
                g6.setOnClickListener {
                    grid(g6)
                }
                g7.setOnClickListener {
                    grid(g7)
                }
                g8.setOnClickListener {
                    grid(g8)
                }
                g9.setOnClickListener {
                    grid(g9)
                }
                g10.setOnClickListener {
                    grid(g10)
                }
                g11.setOnClickListener {
                    grid(g11)
                }
                g12.setOnClickListener {
                    grid(g12)
                }
                g13.setOnClickListener {
                    grid(g13)
                }
                g14.setOnClickListener {
                    grid(g14)
                }
                g15.setOnClickListener {
                    grid(g15)
                }
                g16.setOnClickListener {
                    grid(g16)
                }
        }
        app()
        fun dialog() {
            val dialogBinding1 = layoutInflater.inflate(R.layout.gameover, null)
            val mydialog1 = Dialog(this)
            mydialog1.setContentView(dialogBinding1)
            mydialog1.setCancelable(true)
            val scores = dialogBinding1.findViewById<TextView>(R.id.score)
            score = scores.text.toString()
            scores.text = "     "  + scores.text.toString() + "    ${life * 100}"
            val home1 = dialogBinding1.findViewById<Button>(R.id.home1)
            val playagain = dialogBinding1.findViewById<Button>(R.id.playagain)
            playagain.setOnClickListener {
                life = 3
                h1.setImageResource(R.drawable.yellowheart)
                h2.setImageResource(R.drawable.yellowheart)
                h3.setImageResource(R.drawable.yellowheart)
                scores.text = score
                mydialog1.dismiss()
                resetting(g1)
                resetting(g2)
                resetting(g3)
                resetting(g4)
                resetting(g5)
                resetting(g6)
                resetting(g7)
                resetting(g8)
                resetting(g9)
                resetting(g10)
                resetting(g11)
                resetting(g12)
                resetting(g13)
                resetting(g14)
                resetting(g15)
                resetting(g16)
                check.isEnabled=false
                app()
            }
            home1.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                if((life*100).toString()> highscore.toString()){
                    highscore=(life*100).toString()
                }
                sf=getSharedPreferences("MY", Context.MODE_PRIVATE)
                val editor=sf.edit()
                editor.putString("highscore",highscore)
                editor.apply()
                startActivity(intent)
                mydialog1.dismiss()
            }
            mydialog1.show()
        }
        check.setOnClickListener{
            check.isEnabled=false
                if (word != null) {
                    if (n.uppercase()==word.uppercase()) {
                        Toast.makeText(
                            this@MainActivity2,
                            "CONGRATULATIONS , YOU GOT THE WORD RIGHT",
                            Toast.LENGTH_LONG
                        ).show()
                        dialog()}
                    else{
                        if(life>1) {
                        Toast.makeText(
                            this@MainActivity2,
                            "SORRY , YOU GOT THE WORD WRONG AND LOST A LIFE",
                            Toast.LENGTH_LONG
                        ).show()
                        life -= 1
                        resetting(g1)
                        resetting(g2)
                        resetting(g3)
                        resetting(g4)
                        resetting(g5)
                        resetting(g6)
                        resetting(g7)
                        resetting(g8)
                        resetting(g9)
                        resetting(g10)
                        resetting(g11)
                        resetting(g12)
                        resetting(g13)
                        resetting(g14)
                        resetting(g15)
                        resetting(g16)
                        alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                        num = mutableListOf<Int>()
                        text = mutableListOf(
                            ' ',
                            ' ',
                            ' ',
                            ' ',
                            ' ',
                            ' ',
                            ' ',
                            ' ',
                            ' ',
                            ' ',
                            ' ',
                            ' ',
                            ' ',
                            ' ',
                            ' ',
                            ' '
                        )
                        i = 0
                        if (word != null) {
                            while (word.length > i) {
                                a = (0..15).random()
                                if (a in num) {
                                    continue
                                } else {
                                    num.add(a)
                                    text[a] = word[i]
                                    i += 1
                                }
                            }
                        }
                        while (i < 16) {
                            c = (0..15).random()
                            d = (0..25).random()
                            if (c in num) {
                                continue
                            } else {
                                num.add(c)
                                text[c] = alpha[d]
                                i += 1
                            }
                        }
                        g1.text = text[0].toString()
                        g2.text = text[1].toString()
                        g3.text = text[2].toString()
                        g4.text = text[3].toString()
                        g5.text = text[4].toString()
                        g6.text = text[5].toString()
                        g7.text = text[6].toString()
                        g8.text = text[7].toString()
                        g9.text = text[8].toString()
                        g10.text = text[9].toString()
                        g11.text = text[10].toString()
                        g12.text = text[11].toString()
                        g13.text = text[12].toString()
                        g14.text = text[13].toString()
                        g15.text = text[14].toString()
                        g16.text = text[15].toString()
                        if(life==2){
                        h3.setImageResource(R.drawable.greyheart)
                        }
                        if(life==1){
                            h2.setImageResource(R.drawable.greyheart)
                        }
                        app()}
                            else{
                                life=life-1
                            h1.setImageResource(R.drawable.greyheart)
                            Toast.makeText(
                                this@MainActivity2,
                                "U LOST ALL OF YOUR LIVES ,SEE YOU LATER",
                                Toast.LENGTH_LONG
                            ).show()
                            dialog()
                    }}}}
            reset.setOnClickListener {
                resetting(g1)
                resetting(g2)
                resetting(g3)
                resetting(g4)
                resetting(g5)
                resetting(g6)
                resetting(g7)
                resetting(g8)
                resetting(g9)
                resetting(g10)
                resetting(g11)
                resetting(g12)
                resetting(g13)
                resetting(g14)
                resetting(g15)
                resetting(g16)
                app()
            }}}

