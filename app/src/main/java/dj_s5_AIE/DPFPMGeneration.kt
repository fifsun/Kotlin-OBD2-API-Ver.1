package dj_s5_AIE

import com.github.eltonvs.obd.command.ObdCommand
import com.github.eltonvs.obd.command.ObdRawResponse
import com.github.eltonvs.obd.command.bytesToInt

class DPFPMGeneration : ObdCommand() {
        // Required
        override val tag = "DPF_PM_GEN"
        override val name = "DPF PM Generation"
        override val mode = "01"
        override val pid = "22042d"

        // Optional
        override val defaultUnit = "g/l"
        override val handler = { it: ObdRawResponse -> "%.2f".format(bytesToInt(it.bufferedValue) / 100f) }
}