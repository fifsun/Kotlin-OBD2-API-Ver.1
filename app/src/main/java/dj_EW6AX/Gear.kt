package dj_EW6AX

import com.github.eltonvs.obd.command.ObdCommand
import com.github.eltonvs.obd.command.ObdRawResponse
import com.github.eltonvs.obd.command.bytesToInt

class Gear : ObdCommand() {
        // Required
        override val tag = "GEAR"
        override val name = "gear"
        override val mode = "01"
        override val pid = "221E12"

}