package com.example.buttonclicker2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.buttonclicker2.ui.theme.Practice1Theme

class MainActivity : ComponentActivity() {
    private lateinit var textViewStudent: TextView
    private lateinit var checkBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewStudent = findViewById(R.id.textViewStudent)
        checkBox = findViewById(R.id.checkBox)

        val btnWhoAmI = findViewById<Button>(R.id.btnWhoAmI)

        btnWhoAmI.setOnClickListener {
            textViewStudent.text = "My num is Danya"
        }

    }
    fun onBtnItsNotMeClick(view: View?) {
        textViewStudent.text = "Not me!"
        Toast.makeText(this, "Not me!", Toast.LENGTH_SHORT).show()
        checkBox.isChecked = !checkBox.isChecked
    }
}




@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Practice1Theme {
        Greeting("Android")
    }
}