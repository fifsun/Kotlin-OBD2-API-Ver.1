package com.example.kotlin_obd2_apiver1.dj.etc

import com.github.eltonvs.obd.command.ObdCommand
import com.github.eltonvs.obd.command.ObdRawResponse
import com.github.eltonvs.obd.command.bytesToInt

class BatteryEstimatedStateOfCharge : ObdCommand() {
        // Required
        override val tag = "BATT_SOC"
        override val name = "Battery Estimated State of Charge"
        override val mode = "01"
        override val pid = "224028"

        // Optional
        override val defaultUnit = "%"
        override val handler = { it: ObdRawResponse ->"%.1f".format(bytesToInt(it.bufferedValue)) }
}