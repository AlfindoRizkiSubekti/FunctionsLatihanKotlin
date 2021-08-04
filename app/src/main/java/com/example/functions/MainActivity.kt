package com.example.functions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    fun sum2number(a: Int,b: Int):Int{
        return a+b;
    }
    fun sub2number(a: Int,b: Int):Int{
        return a-b;
    }
    fun multi2number(a: Int,b: Int):Int{
        return a*b;
    }
    fun div2number(a: Float,b: Float): Float{
        if(b!=0f)
            return a/b
        else
            return 0f
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSum: Button = findViewById(R.id.Sum)
        val buttonSub: Button = findViewById(R.id.Sub)
        val buttonMulti: Button = findViewById(R.id.Multi)
        val buttonDiv: Button = findViewById(R.id.Div)
        val edtNum1: EditText = findViewById(R.id.edtNum1)
        val edtNum2: EditText = findViewById(R.id.edtNum2)

        buttonSum.setOnClickListener {
            Toast.makeText(this,""+sum2number(edtNum1.text.toString().toInt(),edtNum2.text.toString().toInt()),Toast.LENGTH_SHORT).show()
        }
        buttonSub.setOnClickListener {
            Toast.makeText(this,""+sub2number(edtNum1.text.toString().toInt(),edtNum2.text.toString().toInt()),Toast.LENGTH_SHORT).show()
        }
        buttonMulti.setOnClickListener {
            Toast.makeText(this,""+multi2number(edtNum1.text.toString().toInt(),edtNum2.text.toString().toInt()),Toast.LENGTH_SHORT).show()
        }
        buttonDiv.setOnClickListener {
            Toast.makeText(this,""+div2number(edtNum1.text.toString().toFloat(),edtNum2.text.toString().toFloat()),Toast.LENGTH_SHORT).show()
        }
    }
}