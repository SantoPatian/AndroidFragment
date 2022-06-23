package com.example.fragment.ui.display

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment.R
import com.example.fragment.databinding.FragmentDisplayMessageBinding

class DisplayMessageFragment : Fragment() {

    companion object {
        fun newInstance() = DisplayMessageFragment()
    }

    private lateinit var binding: FragmentDisplayMessageBinding
    private lateinit var viewModel: DisplayMessageViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDisplayMessageBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(DisplayMessageViewModel::class.java)
        // TODO: Use the ViewModel
    }

}