package com.p7k.findcrush
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.p7k.findcrush.Adaptor.RawAdapter
import com.p7k.findcrush.Mode.Raw
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var rawArray = ArrayList<Raw>()
        rawArray.add(Raw(R.drawable.hughprofile,"Hugh Jackman","1h",R.drawable.hughpic,"1k","500","49"))
        rawArray.add(Raw(R.drawable.ryanprofile,"Ryan Raynold","7h",R.drawable.rayypic,"2k","132","88"))

        var productAdapter =  RawAdapter(rawArray)
        recyclerview.layoutManager =  LinearLayoutManager(this)
        recyclerview.adapter = productAdapter

    }
}
