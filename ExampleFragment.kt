package com.akardas.viewmodelexamples

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.get
import com.akardas.viewmodelexamples.databinding.FragmentExampleBinding

class ExampleFragment : Fragment() {



    private lateinit var viewModel: ExampleViewModel
    private  var _binding: FragmentExampleBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?, ): View {
        _binding = FragmentExampleBinding.inflate(inflater,container,false)
        viewModel = ViewModelProvider(this)[ExampleViewModel::class.java]
        return binding.root
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    companion object {
        fun newInstance() = ExampleFragment()
    }

}