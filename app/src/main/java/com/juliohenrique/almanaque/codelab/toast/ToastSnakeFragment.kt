package com.juliohenrique.almanaque.codelab.toast

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.juliohenrique.almanaque.R

import com.juliohenrique.almanaque.databinding.FragmentToastSnakeBinding
import toast

class ToastSnakeFragment : Fragment(R.layout.fragment_toast_snake) {

    private lateinit var binding: FragmentToastSnakeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentToastSnakeBinding.bind(view)

        binding.toast.setOnClickListener {
            val msg = "Minha mensagem para você!"
            Toast
                .makeText(requireContext(), msg, Toast.LENGTH_SHORT)
                .show()
        }

        binding.snake.setOnClickListener {
            Snackbar.make(view, "Oi Snake", Snackbar.LENGTH_SHORT).show()
        }

        binding.snakeAction.setOnClickListener {
            Snackbar
                .make(view, "Snake with Action", Snackbar.LENGTH_SHORT)
                .setAction(R.string.ok) { toast("I am a snake!") }
                .show()
        }

    }

}