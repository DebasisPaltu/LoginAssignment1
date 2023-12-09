package com.example.loginassignment1.Activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.loginassignment1.Fragment.AddFragment
import com.example.loginassignment1.Fragment.DiscoverFragment
import com.example.loginassignment1.Fragment.HomeFragment
import com.example.loginassignment1.Fragment.NotificationFragment
import com.example.loginassignment1.Fragment.ProfileFragment
import com.example.loginassignment1.R
import com.example.loginassignment1.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {

//    private lateinit var binding : ActivityMainBinding
//    private lateinit var homefragment : HomeFragment
//    private lateinit var discoverfragment : DiscoverFragment
//    private lateinit var addFragment: AddFragment
//    private lateinit var notififragment: NotificationFragment
//    private lateinit var profileFragment : ProfileFragment


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

//         bindingbottonNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigationView);
//        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
//        setSupportActionBar(toolbar)



//       binding.bottomNavigationView.setOnNavigationItemReselectedListener { menuInflater->
//            when(menuInflater.itemId){
//                R.id.navigation_home ->{
//                    replaceFragment(homefragment)
//                    true
//                }
//                R.id.navigation_discover ->{
//                    replaceFragment(discoverfragment)
//                    true
//                }
//                R.id.navigation_add ->{
//                    replaceFragment(addFragment)
//                    true
//                }
//                R.id.navigation_notifications ->{
//                    replaceFragment(notififragment)
//                    true
//                }
//                R.id.navigation_profile ->{
//                    replaceFragment(profileFragment)
//                    true
//                }else -> false
//            }
//        }

//        binding.bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
//            when (menuItem.itemId) {
//                R.id.navigation_home -> {
//                    // Handle Home item click
//                    true
//                }
//                R.id.navigation_discover -> {
//                    // Handle Dashboard item click
//                    true
//                }
//                R.id.navigation_add -> {
//                    // Handle Dashboard item click
//                    true
//                }
//                R.id.navigation_notifications -> {
//                    // Handle Notifications item click
//                    true
//                }
//                R.id.navigation_profile-> {
//                    // Handle Notifications item click
//                    true
//                }
//                else -> false
//            }
//        }
    }
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.Container,fragment)
            .commit()
    }
}