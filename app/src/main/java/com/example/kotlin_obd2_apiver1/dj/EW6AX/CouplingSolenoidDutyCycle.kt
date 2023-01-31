package com.example.kotlin_obd2_apiver1.dj.EW6AX

import com.github.eltonvs.obd.command.ObdCommand
import com.github.eltonvs.obd.command.ObdRawResponse
import com.github.eltonvs.obd.command.bytesToInt

class CouplingSolenoidDutyCycle : ObdCommand() {
        // Required
        override val tag = "AWD_CSDC_RATIO"
        override val name = "Coupling Solenoid Duty Cycle"
        override val mode = "01"
        override val pid = "221E7A"

        // Optional
        override val defaultUnit = "%"
        override val handler = { it: ObdRawResponse ->"%.1f".format(bytesToInt(it.bufferedValue)) }
}