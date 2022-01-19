  package edu.uw.abdiwahid.activities_demo

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

  class MainActivity : AppCompatActivity() {
      private val TAG = "MAIN_ACTIVITY"
      private val COUNT_KEY = "count_key"
      private  var count = 0;
      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "ON CREATE CALLED")

        val button = findViewById<Button>(R.id.btn_button)

        button.setOnClickListener {
            count++
            Log.d(TAG, "You click $count times")
        }

        // if weve been recreated from config change
        if(savedInstanceState != null){
           var counted = savedInstanceState.getInt(COUNT_KEY)

            count = counted;
        }

    }

      override fun onStart() {
          super.onStart()

          Log.d(TAG, "On start called")
      }


      override fun onSaveInstanceState(outState: Bundle) {
          super.onSaveInstanceState(outState)

          outState.putInt(COUNT_KEY, count)
      }

      override fun onResume() {
          super.onResume()
          Log.d(TAG, "On Resume called")
      }

      override fun onPause() {
          super.onPause()

          Log.d(TAG, "On Pause called")
      }

      override fun onStop() {
          super.onStop()
          Log.d(TAG, "On Stop Called")
      }

      override fun onRestart() {
          super.onRestart()

          Log.d(TAG, "On restart called")
      }

      override fun onDestroy() {
          super.onDestroy()

          Log.d(TAG, "On destroy called")
      }


}