package com.example.kotlin_obd2_apiver1.dj.EW6AX

import com.github.eltonvs.obd.command.ObdCommand

class Gear : ObdCommand() {
        // Required
        override val tag = "GEAR"
        override val name = "gear"
        override val mode = "01"
        override val pid = "221E12"

}