package com.molidev8.customswitchsamples.view.customSwitch

sealed class CustomSwitchType() {
    object Vanilla : CustomSwitchType()
    object CustomThumbSmallSwitch : CustomSwitchType()
    object CustomThumbBigSwitch : CustomSwitchType()
    object CustomTrackPillSwitch : CustomSwitchType()
}
