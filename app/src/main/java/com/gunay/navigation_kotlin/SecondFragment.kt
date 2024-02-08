package com.gunay.navigation_kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.gunay.navigation_kotlin.databinding.FragmentFirstBinding
import com.gunay.navigation_kotlin.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private var myAge = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            myAge = SecondFragmentArgs.fromBundle(it).age
            binding.secondFragmentTextView2.text = myAge.toString()
            //println(myAge)
        }

        binding.secondFragmentButton.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            Navigation.findNavController(it).navigate(action)
        }

    }
}