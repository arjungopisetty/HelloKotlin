package cs371m.arjungopisetty.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.i("Hello World!")
    }
}
