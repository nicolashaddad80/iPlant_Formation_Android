package com.iplant.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.iplant.R
import com.iplant.databinding.FragmentFavoritesBinding
import com.iplant.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

    private lateinit var searchViewModel: SearchViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {

        searchViewModel = ViewModelProvider(this).get(SearchViewModel::class.java)

        val binding: FragmentSearchBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_search, container, false
        )

        binding.viewModel = searchViewModel

        return binding.root
    }

}