package com.iplant.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.iplant.R

import com.iplant.databinding.FragmentSearchBinding
import com.iplant.ui.details.DetailsViewModel

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

        binding.button.setOnClickListener {

            val action = SearchFragmentDirections.actionNavigationSearchToNavigationDetails(
                idPlant = "1234"
            )

            findNavController().navigate(action)

        }



        return binding.root
    }

}
