package com.iplant.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.iplant.R
import com.iplant.databinding.FragmentDetailsBinding


class DetailsFragment : Fragment() {

    private lateinit var detailsViewModel: DetailsViewModel
    private val args: DetailsFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        detailsViewModel = ViewModelProvider(this).get(DetailsViewModel::class.java)

        val binding: FragmentDetailsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_details, container, false
        )
        Toast.makeText(requireContext(),args.idPlant, Toast.LENGTH_LONG).show()


        //binding.viewModel = detailsViewModel

        return binding.root
    }
}
