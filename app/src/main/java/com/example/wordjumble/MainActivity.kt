package com.example. wordjumble

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import com.example.wordjumble.MainActivity2
import com.example.wordjumble.R

class MainActivity : AppCompatActivity() {
    private lateinit var hsw:String
    private lateinit var hs:TextView
    private lateinit var sf:SharedPreferences

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text1: TextView =findViewById(R.id.text1)
        val text2: TextView=findViewById(R.id.text2)
        val start: ImageButton=findViewById(R.id.start)

        hs=findViewById(R.id.hs)

        val sf=getSharedPreferences("MY", Context.MODE_PRIVATE)
        hsw=sf.getString("highscore","").toString()
        hs.text=hsw
        start.setOnClickListener {
            if(text1.text.toString()==""||text2.text.toString()==""||text1.text.length>16 ){
                Toast.makeText(this@MainActivity,"Enter Word , Clue and Word Length <17",Toast.LENGTH_LONG).show()

            }
            else{

                val intent= Intent(this, MainActivity2::class.java)
                intent.putExtra("word",text1.text.toString())
                intent.putExtra("clue",text2.text.toString())
                intent.putExtra("highscore",hsw)
                startActivity(intent)
            }
        }
    }


    }


