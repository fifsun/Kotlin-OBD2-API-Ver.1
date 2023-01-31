package com.example.kotlin_obd2_apiver1.dj.S5_AIE

import com.github.eltonvs.obd.command.ObdCommand
import com.github.eltonvs.obd.command.ObdRawResponse
import com.github.eltonvs.obd.command.ObdResponse

class DPFRegenerationStatus : ObdCommand() {
        // Required
        override val tag = "DPF_REG_STS"
        override val name = "DPF Regeneration Status"
        override val mode = "01"
        override val pid = "220380"

        // Optional
        override val handler = { it: ObdRawResponse ->
                val dpf = it.bufferedValue[2]
                val dpfSts = (dpf and 0x80) == 128
                dpfSts.toString()
        }

        override fun format(response: ObdResponse): String {
                val dpfSts = response.value.toBoolean()
                return "DPF_REG_STS is ${if (dpfSts) "ON" else "OFF"}"
        }
}