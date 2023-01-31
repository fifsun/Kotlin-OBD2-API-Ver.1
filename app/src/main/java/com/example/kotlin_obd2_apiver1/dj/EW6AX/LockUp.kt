package com.example.kotlin_obd2_apiver1.dj.EW6AX

import com.github.eltonvs.obd.command.ObdCommand

class LockUp : ObdCommand() {
        // Required
        override val tag = "LOCK_UP"
        override val name = "Lock Up"
        override val mode = "01"
        override val pid = "221E24"

        // Optional
        override val defaultUnit = "%"
}