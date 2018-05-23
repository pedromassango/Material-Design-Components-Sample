package com.pedromassango.materialdesigncomponents

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setSupportActionBar(toolbar)


    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        if (item!!.itemId == android.R.id.home) {
            Toast.makeText(this,
                    "Menu hamburger clicked",
                    Toast.LENGTH_SHORT)
                    .show()
        }

        return super.onOptionsItemSelected(item)
    }
}
