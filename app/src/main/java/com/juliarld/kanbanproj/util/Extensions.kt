package com.juliarld.kanbanproj.util

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.juliarld.kanbanproj.R
import com.juliarld.kanbanproj.databinding.BottonSheetBinding

fun Fragment.initToolbar(toolbar: Toolbar){
    (activity as AppCompatActivity).setSupportActionBar(toolbar)
    (activity as AppCompatActivity).title=""
    (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
    toolbar.setNavigationOnClickListener {
        activity?.onBackPressedDispatcher?.onBackPressed()
    }

}

fun Fragment.showBottomSheet(
    titleDialog: Int? = null,
    titleButton: Int? = null,
    message: String,
    onClick: () -> Unit ={}
){
    val bottomSheetDialog = BottomSheetDialog(requireContext(), R.style.BottomSheetDialog)
    val binding: BottonSheetBinding  =
        BottonSheetBinding.inflate(layoutInflater, null, false)

    binding.textviewTitle.text= getText(titleDialog ?: R.string.text_title_warning)

    binding.textviewMessage.text = message

    binding.buttonOk.text = getText(titleButton ?: R.string.text_button_warning)

    binding.buttonOk.setOnClickListener {
        onClick()
        bottomSheetDialog.dismiss()
    }

    bottomSheetDialog.setContentView(binding.root) //define qual será o conteúdo visual (layout) que o BottomSheetDialog vai exibir
    bottomSheetDialog.show() //Exibe o BottomSheetDialog na tela.


}