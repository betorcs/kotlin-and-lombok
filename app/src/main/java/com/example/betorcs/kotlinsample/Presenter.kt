package com.example.betorcs.kotlinsample

class Presenter(val view: View) {

    fun loadSeason() {
        val season = Season()
        season.name = "Spring"
        view.showSeason(season)
    }

}