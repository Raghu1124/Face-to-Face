package com.example.videocall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtRoom= findViewById<EditText>(R.id.edt_room)
        val btnJoin= findViewById<Button>(R.id.btn_join)

        btnJoin.setOnClickListener {
            if(edtRoom.text.toString().isEmpty()){
                Toast.makeText(this, "Please Enter the Room Number", Toast.LENGTH_SHORT).show()
            }
            else{
                val vInt= Intent(this@MainActivity, VideoCall::class.java)
                vInt.putExtra("callId", edtRoom.text.toString())
                startActivity(vInt)
            }
        }
    }
}