package com.example.deeplinkapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.deeplinkapp.databinding.FragmentSecondBinding


class secondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private val args: secondFragmentArgs by navArgs()
    var Productname = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("Product", Productname )
        Productname=args.productname
        Log.e("Productname", Productname )
        binding.text2.text=Productname

        binding.btn2.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        })


    }
}