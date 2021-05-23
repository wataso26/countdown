package app.wataso_.watanabe.countup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var tapCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

             tapCount= tapCount +1

            textView.text = tapCount.toString()

        button2.setOnClickListener {

            tapCount = tapCount -1

        }

        }
    }
}