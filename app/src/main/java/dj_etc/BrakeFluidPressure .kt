package dj_etc

import com.github.eltonvs.obd.command.ObdCommand
import com.github.eltonvs.obd.command.ObdRawResponse
import com.github.eltonvs.obd.command.bytesToInt

class BrakeFluidPressure : ObdCommand() {
        // Required
        override val tag = "BFP"
        override val name = "Brake Fluid Pressure"
        override val mode = "01"
        override val pid = "22280A"

        // Optional
        override val defaultUnit = "%"
        override val handler = { it: ObdRawResponse ->"%.1f".format(bytesToInt(it.bufferedValue)) }
}