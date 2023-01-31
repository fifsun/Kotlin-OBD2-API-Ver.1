package com.example.kotlin_obd2_apiver1.dj.S5_AIE

import com.github.eltonvs.obd.command.ObdCommand
import com.github.eltonvs.obd.command.ObdRawResponse
import com.github.eltonvs.obd.command.bytesToInt

class DPFPMAccumulation : ObdCommand() {
        // Required
        override val tag = "DPF_PM_ACC"
        override val name = "DPF PM Accumulation"
        override val mode = "01"
        override val pid = "22042c"

        // Optional
        override val defaultUnit = "g/l"
        override val handler = { it: ObdRawResponse -> "%.2f".format(bytesToInt(it.bufferedValue) / 100f) }
}