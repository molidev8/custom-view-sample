package com.molidev8.customswitchsamples.view.customSwitch

object CustomSwitchFactory {

    fun build(type: CustomSwitchType): CustomSwitchManager = when (type) {
        CustomSwitchType.CustomThumbBigSwitch -> CustomSwitchThumbBig()
        CustomSwitchType.CustomThumbSmallSwitch -> CustomSwitchThumbSmall()
        CustomSwitchType.CustomTrackPillSwitch -> CustomSwitchThumbPill()
        CustomSwitchType.Vanilla -> CustomSwitchVanilla()
    }
}