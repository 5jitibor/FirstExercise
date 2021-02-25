package es.usj.androidapps.alu100495.firstexercise

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var tvVisible = false;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.visibility= TextView.INVISIBLE
        button.setOnClickListener{
            toggleVisibility()

        }
    }
    fun toggleVisibility(){
        val visibility = if(textView.visibility== TextView.VISIBLE) {
            textView.visibility= TextView.INVISIBLE
        }else textView.visibility= TextView.VISIBLE
    }
}

