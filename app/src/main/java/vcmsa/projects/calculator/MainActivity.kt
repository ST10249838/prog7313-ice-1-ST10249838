package vcmsa.projects.calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNum1 = findViewById<EditText>(R.id.edtNum1)
        val edtNum2 = findViewById<EditText>(R.id.edtNum2)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)

        btnCalculate.setOnClickListener {
            val num1Str = edtNum1.text.toString()
            val num2Str = edtNum2.text.toString()

            if (num1Str.isNotEmpty() && num2Str.isNotEmpty()) {
                try {
                    val num1 = num1Str.toInt()
                    val num2 = num2Str.toInt()
                    val sum = num1 + num2

                    // Create an Intent to start ResultActivity
                    val intent = Intent(this, ResultActivity::class.java)
                    // Pass the result to the new activity
                    intent.putExtra("result", sum)
                    startActivity(intent)
                } catch (e: NumberFormatException) {
                    Toast.makeText(this, "Invalid input! Please enter valid numbers.", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show()
            }
        }
    }
}