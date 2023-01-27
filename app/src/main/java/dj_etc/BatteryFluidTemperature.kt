package dj_etc

import com.github.eltonvs.obd.command.ObdCommand

class BatteryFluidTemperature : ObdCommand() {
        // Required
        override val tag = "BATT_TEMP"
        override val name = "Battery Fluid Temperature"
        override val mode = "01"
        override val pid = "224029"

        // Optional
        override val defaultUnit = "°C"
}