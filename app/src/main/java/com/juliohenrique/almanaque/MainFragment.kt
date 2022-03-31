package com.juliohenrique.almanaque

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.juliohenrique.almanaque.databinding.FragmentMainBinding
import navTo


class MainFragment : androidx.fragment.app.Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        binding.codelabToastSnake.setOnClickListener { navTo(R.id.toastSnakeFragment) }
    }

}