package sk.uniza.fri.autoskola

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import sk.uniza.fri.autoskola.data.Questions
import sk.uniza.fri.autoskola.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var _appBarConfiguration: AppBarConfiguration
    private lateinit var _binding: ActivityMainBinding
    private val _questions = Questions()
    private var _currentCategory = -1

    /**
     * Returns generated questions
     * @return Generated questions
     */
    val generateQuestions get() = _questions.generateQuestions(_currentCategory)
    val getCategories get() = _questions.categories

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        _questions.loadJson(applicationContext)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        setSupportActionBar(_binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        _appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, _appBarConfiguration)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)

        return navController.navigateUp(_appBarConfiguration) || super.onSupportNavigateUp()
    }

    fun setCategory(value: Int) {
        _currentCategory = value
    }

}