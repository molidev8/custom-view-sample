package com.molidev8.customswitchsamples.view.customSwitch

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.molidev8.customswitchsamples.R
import com.molidev8.customswitchsamples.view.customSwitch.CustomSwitchType.*

class CustomSwitch : ConstraintLayout {

    private lateinit var manager: CustomSwitchManager

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        readAttrs(attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        readAttrs(attrs)
    }

    private fun readAttrs(attrs: AttributeSet) {
        with(context.theme.obtainStyledAttributes(attrs, R.styleable.CustomSwitch, 0, 0)) {
            inflateView(
                getSwitchTypeFromAttr(this),
                getBoolean(R.styleable.CustomSwitch_anim_text, false),
                getBoolean(R.styleable.CustomSwitch_manual, false),
                getBoolean(R.styleable.CustomSwitch_textVisible, false),
                getString(R.styleable.CustomSwitch_text).orEmpty()
            )
            recycle()
        }
    }

    private fun getSwitchTypeFromAttr(attributes: TypedArray): CustomSwitchType =
        when (attributes.getInt(R.styleable.CustomSwitch_switch_type, 1)) {
            1 -> Vanilla
            2 -> CustomThumbSmallSwitch
            3 -> CustomThumbBigSwitch
            else -> CustomTrackPillSwitch
        }

    private fun inflateView(
        type: CustomSwitchType,
        animText: Boolean,
        manual: Boolean,
        textVisible: Boolean,
        text: String
    ) {
        manager = CustomSwitchFactory.build(type)
        removeAllViews()
        manager.initView(context, this, animText, manual, textVisible, text)
    }
}