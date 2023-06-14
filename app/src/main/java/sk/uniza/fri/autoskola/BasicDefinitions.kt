package sk.uniza.fri.autoskola

import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import sk.uniza.fri.autoskola.databinding.ActivityBasicDefinitionsBinding

class BasicDefinitions : AppCompatActivity() {

    private lateinit var binding: ActivityBasicDefinitionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBasicDefinitionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
    }
}