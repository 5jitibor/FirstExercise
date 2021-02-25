package es.usj.androidapps.alu100495.firstexercise

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        var number = 0;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.setText(number.toString())
        //textView.visibility= TextView.VISIBLE
        plus1.setOnClickListener{
            number++
            textView.setText(number.toString())
        }
       plus2.setOnClickListener{
            number+= 2
            textView.setText(number.toString())
       }
        plus3.setOnClickListener{
            number+= 3
            textView.setText(number.toString())
        }
        less1.setOnClickListener{
            number--
            textView.setText(number.toString())
        }
        less2.setOnClickListener{
            number-= 2
            textView.setText(number.toString())
        }
        less3.setOnClickListener{
            number-= 3
            textView.setText(number.toString())
        }

        multiply2.setOnClickListener{
            number*=2
            textView.setText(number.toString())
        }
        multiply3.setOnClickListener{
            number*= 3

            textView.setText(number.toString())
        }
        multiply4.setOnClickListener{
            number*= 4
            textView.setText(number.toString())
        }
        multiplyNegative2.setOnClickListener{
            number*= -2
            textView.setText(number.toString())
        }
        multiplyNegative3.setOnClickListener{
            number*= -3
            textView.setText(number.toString())
        }
        multiplyNegative4.setOnClickListener{
            number*= -4
            textView.setText(number.toString())
        }

       reset.setOnClickListener{
           number=0
           textView.setText(number.toString())
       }
    }
}

