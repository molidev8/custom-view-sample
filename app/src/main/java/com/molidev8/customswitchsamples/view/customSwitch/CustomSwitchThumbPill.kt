package com.molidev8.customswitchsamples.view.customSwitch

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.molidev8.customswitchsamples.databinding.CustomSwitchThumbPillBinding

class CustomSwitchThumbPill : CustomSwitchManager {

    private lateinit var binding: CustomSwitchThumbPillBinding

    override fun initView(
        context: Context,
        viewGroup: ViewGroup,
        animText: Boolean,
        manual: Boolean,
        textVisible: Boolean,
        text: String
    ) {
        binding = CustomSwitchThumbPillBinding.inflate(LayoutInflater.from(context), viewGroup, true)
        setText(text)
    }

    override fun setAnimText(shouldAnim: Boolean) {
        // do something
    }

    override fun setManual(shouldBeManual: Boolean) {
        // do something
    }

    override fun setTextVisible(shouldBeVisible: Boolean) {
        // do something
    }

    override fun setText(text: String) {
        binding.switchHint.text = text
    }
}