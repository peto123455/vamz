package sk.uniza.fri.autoskola

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sk.uniza.fri.autoskola.databinding.ActivityBasicDefinitionsBinding

class BasicDefinitionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBasicDefinitionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBasicDefinitionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
    }
}