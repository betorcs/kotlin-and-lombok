package com.example.betorcs.kotlinsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity(), View {

    private val presenter: Presenter by lazy {
        Presenter(this)
    }

    private val textView: TextView by lazy {
        findViewById<TextView>(android.R.id.text1)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.loadSeason();
    }

    override fun showSeason(season: Season?) {
        textView.text = season?.name ?: "unknown"
    }
}
