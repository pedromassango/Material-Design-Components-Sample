package com.pedromassango.materialdesigncomponents

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // You can find the current code on GitHub, check the links on description

        //With MDC it is very simple to:

        // 1 - Add an password visibility button
        // 2 - Set button corner radius (make a circular button)
        // 3 - Make an button with transparent background
        // 4 - Simple way to use Toolbar
        // 5 - Set an toolbar back icon
        // 6 - titleTextColor (change Toolbar title color

        // Thanks for watching, see you later...

        btn_login.setOnClickListener {

            startActivity( Intent(this, HomeActivity::class.java))
        }
    }
}
