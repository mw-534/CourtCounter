package com.example.android.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Tracks the score for Team A
    var scoreTeamA = 0

    // Tracks the score for Team B
    var scoreTeamB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    
    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = findViewById<TextView>(R.id.team_a_score)
        scoreView.text = score.toString()
    }

    /**
     * This method is called from button +3 points.
     */
    fun addThreeForTeamA(view: View?) {
        scoreTeamA += 3
        displayForTeamA(scoreTeamA)
    }

    /**
     * This method is called from button +2 points.
     */
    fun addTwoForTeamA(view: View?) {
        scoreTeamA += 2
        displayForTeamA(scoreTeamA)
    }

    /**
     * This method is called from button free throw.
     */
    fun addOneForTeamA(view: View?) {
        scoreTeamA += 1
        displayForTeamA(scoreTeamA)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = findViewById<TextView>(R.id.team_b_score)
        scoreView.text = score.toString()
    }

    /**
     * This method is called from button +3 points.
     */
    fun addThreeForTeamB(view: View?) {
        scoreTeamB += 3
        displayForTeamB(scoreTeamB)
    }

    /**
     * This method is called from button +2 points.
     */
    fun addTwoForTeamB(view: View?) {
        scoreTeamB += 2
        displayForTeamB(scoreTeamB)
    }

    /**
     * This method is called from button free throw.
     */
    fun addOneForTeamB(view: View?) {
        scoreTeamB += 1
        displayForTeamB(scoreTeamB)
    }

    /**
     * Resets the scores for Teams A and B
     */
    fun resetScore(view: View?) {
        scoreTeamA = 0
        scoreTeamB = 0
        displayForTeamA(scoreTeamA)
        displayForTeamB(scoreTeamB)
    }
}