package com.devproject.miguelfagundez.navcompapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.NavGraphNavigator
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupActionBarWithNavController
import com.devproject.miguelfagundez.navcompapp.views.FirstFragmentDirections
import com.devproject.miguelfagundez.navcompapp.views.GlobalFragmentDirections
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navFragmentContainer = supportFragmentManager.findFragmentById(R.id.main_fragment_container) as NavHostFragment
        navController = navFragmentContainer.findNavController()

        setSupportActionBar(toolbar)
        setupActionBarWithNavController(navController)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if(item.itemId == R.id.globalFragmentItem) {
            val action = NavegationDirections.actionGlobalGlobalFragment()

            navController.navigate(action)
            true
        }else{
            item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
        }


    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}