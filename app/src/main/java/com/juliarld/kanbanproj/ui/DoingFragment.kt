package com.juliarld.kanbanproj.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.juliarld.kanbanproj.R
import com.juliarld.kanbanproj.databinding.FragmentDoingBinding
import com.juliarld.kanbanproj.databinding.FragmentRegisterBinding


class DoingFragment : Fragment() {
    private var _binding: FragmentDoingBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDoingBinding.inflate(inflater, container, false)
        return  binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}