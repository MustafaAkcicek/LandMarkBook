package com.dot.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dot.landmarkbook.databinding.ActivityDetailsBinding
import com.dot.landmarkbook.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var  binding : ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view:View = binding.root
        setContentView(view)



        val intent = intent

        //casting
        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark

        binding.nameTEXT.text = selectedLandmark.name
        binding.countryTEXT.text = selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)


    }
}