package dj_etc

import com.github.eltonvs.obd.command.ObdCommand
import com.github.eltonvs.obd.command.ObdRawResponse
import com.github.eltonvs.obd.command.bytesToInt

class BrakeSwitch : ObdCommand() {
        // Required
        override val tag = "BRAKE_SW"
        override val name = "Brake Switch"
        override val mode = "01"
        override val pid = "22DA05"

        // Optional
        override val defaultUnit = "%"
        override val handler = { it: ObdRawResponse ->"%.1f".format(bytesToInt(it.bufferedValue)) }
}