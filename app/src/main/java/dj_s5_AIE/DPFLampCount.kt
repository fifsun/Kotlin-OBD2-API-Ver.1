package dj_s5_AIE

import com.github.eltonvs.obd.command.ObdCommand
import com.github.eltonvs.obd.command.ObdRawResponse
import com.github.eltonvs.obd.command.bytesToInt

class DPFLampCount : ObdCommand() {
        // Required
        override val tag = "DPF_LMP_CNT"
        override val name = "DPF Lamp Count"
        override val mode = "01"
        override val pid = "220433"

        // Optional
        override val defaultUnit = "CNT"
        override val handler = { it: ObdRawResponse -> bytesToInt(it.bufferedValue).toString() }
}