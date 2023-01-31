package com.example.kotlin_obd2_apiver1.dj.S5_AIE

import com.github.eltonvs.obd.command.ObdCommand
import com.github.eltonvs.obd.command.ObdRawResponse
import com.github.eltonvs.obd.command.bytesToInt

class DPFRegenerationCount : ObdCommand() {
        // Required
        override val tag = "DPF_REG_CNT"
        override val name = "DPF Regeneration Count"
        override val mode = "01"
        override val pid = "220432"

        // Optional
        override val defaultUnit = "CNT"
        override val handler = { it: ObdRawResponse -> bytesToInt(it.bufferedValue).toString() }
}