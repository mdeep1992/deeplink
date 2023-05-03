package com.example.deeplinkapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.deeplinkapp.databinding.FragmentSecondBinding
import com.example.deeplinkapp.databinding.FragmentThirdBinding

private  lateinit var binding: FragmentThirdBinding
class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding=FragmentThirdBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn3.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)
        })

    }
}