package com.example.kotlin_obd2_apiver1.ui.skyactivForDiesel

import com.github.eltonvs.obd.connection.ObdDeviceConnection
import java.io.InputStream
import java.io.OutputStream

class skyactivForDiesel private constructor(inputStream: InputStream, outputStream: OutputStream) {

    val obdConnection = ObdDeviceConnection(inputStream, outputStream)

}