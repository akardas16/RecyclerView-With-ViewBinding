package com.akardas.viewmodelexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.akardas.viewmodelexamples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val list = arrayListOf("Ali","Ahsen","Mehmet","Melda","Adam","Sena")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.recyclerView.layoutManager =  LinearLayoutManager(baseContext,
            LinearLayoutManager.VERTICAL,false)
        binding.recyclerView.edgeEffectFactory = BounceEdgeEffectFactory()

        binding.recyclerView.adapter = SpecialRecyclerAdapter(list,this)

        setContentView(binding.root)
    }
}