package ipca.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var textViewHello : TextView = TextView(this)
        textViewHello.text = "Hello world!"

        var buttonTranslate = Button(this)
        buttonTranslate.text = "Traduzir"
        buttonTranslate.setOnClickListener {
            textViewHello.text = "Olá mundo!"
        }

        var linearLayout = LinearLayout(this)
        linearLayout.addView(textViewHello)
        linearLayout.addView(buttonTranslate)

        setContentView(linearLayout)
    }
}