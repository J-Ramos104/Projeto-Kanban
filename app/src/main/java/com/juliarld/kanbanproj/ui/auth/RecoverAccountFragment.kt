package com.juliarld.kanbanproj.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.juliarld.kanbanproj.R
import com.juliarld.kanbanproj.databinding.FragmentRecoverAccountBinding
import com.juliarld.kanbanproj.databinding.FragmentSplashBinding
import com.juliarld.kanbanproj.util.initToolbar
import com.juliarld.kanbanproj.util.showBottomSheet

class RecoverAccountFragment : Fragment() {

    private var _binding: FragmentRecoverAccountBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRecoverAccountBinding.inflate(inflater, container,false)
        return  binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar(binding.toolbar)
        initListener()
    }
    private fun initListener(){
        binding.btnEnviar.setOnClickListener {
            validateData()
        }
    }
    private fun validateData(){
        val email = binding.EDEmail.text.toString().trim()

        if (email.isNotBlank()){
                Toast.makeText(requireContext(),"Tudo OK!", Toast.LENGTH_SHORT).show()
        }else{
            showBottomSheet(message = getString(R.string.email_empty))

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}