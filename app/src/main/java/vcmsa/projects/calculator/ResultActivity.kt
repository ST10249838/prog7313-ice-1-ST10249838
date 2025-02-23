package vcmsa.projects.calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    val btnBack: Button = findViewById(R.id.btnBack)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // Retrieve the result passed from MainActivity
        val result = intent.getIntExtra("result", 0)
        val resultTextView: TextView = findViewById(R.id.resultTextView)
        resultTextView.text = "Result: $result"

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}