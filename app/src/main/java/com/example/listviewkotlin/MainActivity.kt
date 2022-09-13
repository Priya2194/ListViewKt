package com.example.listviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val language:Array<String> =resources.getStringArray(R.array.lang_name)

        val arrayAdapter= ArrayAdapter <String>(this,android.R.layout.simple_list_item_1,language)

        listView.adapter=arrayAdapter
    }
}