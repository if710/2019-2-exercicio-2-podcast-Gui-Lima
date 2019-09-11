package br.ufpe.cin.android.podcast

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.io.FileReader
import java.io.IOException
import androidx.recyclerview.widget.LinearLayoutManager



class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        feed_view.layoutManager = LinearLayoutManager(this)

   }

}
