package emquart.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            val intent = Intent(this, LettersActivity::class.java)
                startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this, NumbersActivity::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent = Intent(this, ColorsActivity::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            val intent = Intent(this, ShapesActivity::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            val intent = Intent(this, AnimalsActivity::class.java)
            startActivity(intent)
        }

        button7.setOnClickListener {
            val intent = Intent(this, FoodActivity::class.java)
            startActivity(intent)
        }

        button8.setOnClickListener {
            val intent = Intent(this, PeopleActivity::class.java)
            startActivity(intent)
        }
    }
}
