package com.example.kotlin_obd2_apiver1.dj.S5_AIE

import com.github.eltonvs.obd.command.ObdCommand
import com.github.eltonvs.obd.command.ObdRawResponse
import com.github.eltonvs.obd.command.calculatePercentage

class EGRBValvePosition : ObdCommand() {
        // Required
        override val tag = "EGR_B_POS"
        override val name = "EGR B Valve Position"
        override val mode = "01"
        override val pid = "22f469"

        // Optional
        override val defaultUnit = "%"
        override val handler = { it: ObdRawResponse -> "%.1f".format(calculatePercentage(it.bufferedValue)) }
}