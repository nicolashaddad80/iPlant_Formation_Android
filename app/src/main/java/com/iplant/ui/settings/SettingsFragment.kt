package com.iplant.ui.settings

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.iplant.R
import com.iplant.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {

    private lateinit var settingsViewModel: SettingsViewModel
    private  val mesPrefs = activity?.getSharedPreferences("PREFS",Context.MODE_PRIVATE)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        settingsViewModel = ViewModelProvider(this).get(SettingsViewModel::class.java)

        val binding: FragmentSettingsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_settings, container, false
        )
        val nightModeEnabled = mesPrefs?.getBoolean("Night_Mode", false)
        binding.switch1.isChecked = nightModeEnabled?:false

        binding.switch1.setOnCheckedChangeListener { _, isChecked: Boolean->
            AppCompatDelegate.setDefaultNightMode(
                if (isChecked) {
                    mesPrefs?.edit()?.putBoolean("Night_Mode", true)?.apply()
                    AppCompatDelegate.MODE_NIGHT_YES
                } else {
                    mesPrefs?.edit()?.putBoolean("Night_Mode", false)?.apply()
                    AppCompatDelegate.MODE_NIGHT_NO
                })

        }
        return binding.root
    }
}
