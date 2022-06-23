package com.example.fragment.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.example.fragment.databinding.FragmentMainBinding
import com.example.fragment.core.Utils

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var binding: FragmentMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var editText: EditText
    private lateinit var message: String
    private lateinit var sendButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        editText = binding.yourMessageContent

        sendButton = binding.yourMessageSendButton
        sendButton.setOnClickListener {
            message = editText.text.toString()
            if (message.isBlank()){
                Utils.print("is Blank1")
            }else{
                Utils.print(message)
            }

            val action = MainFragmentDirections.actionMainFragmentToDisplayMessageFragment(message)
            findNavController().navigate(action)
        }
    }

}