package com.example.fragment.ui.display

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.example.fragment.core.Utils
import com.example.fragment.databinding.FragmentDisplayMessageBinding

class DisplayMessageFragment : Fragment() {

    companion object {
        fun newInstance() = DisplayMessageFragment()
    }

    private lateinit var binding: FragmentDisplayMessageBinding
    private lateinit var viewModel: DisplayMessageViewModel

    private lateinit var textView: TextView
    private var receivedMessage: String? = null
    private val args: DisplayMessageFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDisplayMessageBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[DisplayMessageViewModel::class.java]

        textView = binding.receivedMessageContent
        receivedMessage = args.receivedMessage
        if (receivedMessage.isNullOrBlank()){
            Utils.print("is Null or Blank")
            textView.text = "is Blank2"
        }else{
            Utils.print(receivedMessage.toString())
            textView.text = receivedMessage
        }

    }

}