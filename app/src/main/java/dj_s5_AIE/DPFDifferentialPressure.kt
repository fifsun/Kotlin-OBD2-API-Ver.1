package dj_s5_AIE

import com.github.eltonvs.obd.command.ObdCommand
import com.github.eltonvs.obd.command.ObdRawResponse
import com.github.eltonvs.obd.command.bytesToInt

class DPFDifferentialPressure : ObdCommand() {
        // Required
        override val tag = "DPF_DP"
        override val name = "DPF Differential Pressure"
        override val mode = "01"
        override val pid = "22f47a"

        // Optional
        override val defaultUnit = "kPa"
        override val handler = { it: ObdRawResponse -> bytesToInt(it.bufferedValue).toString() }
}