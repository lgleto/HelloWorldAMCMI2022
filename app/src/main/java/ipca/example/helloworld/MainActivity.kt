package ipca.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var isTranslated = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewHello = findViewById<TextView>(R.id.textViewHello)
        val buttonTranslate = findViewById<Button>(R.id.buttonTranslate)

        buttonTranslate.setOnClickListener {
            if (isTranslated) {
                textViewHello.text = "Hello world!"
            }else {
                textViewHello.text = "Olá mundo!"
            }
            isTranslated = !isTranslated
        }
    }
}