package com.molidev8.customswitchsamples.view.customSwitch

import android.content.Context
import android.view.ViewGroup

interface CustomSwitchManager {

    fun initView(
        context: Context,
        viewGroup: ViewGroup,
        animText: Boolean,
        manual: Boolean,
        textVisible: Boolean,
        text: String
    )

    fun setAnimText(shouldAnim: Boolean)

    fun setManual(shouldBeManual: Boolean)

    fun setTextVisible(shouldBeVisible: Boolean)

    fun setText(text: String)
}