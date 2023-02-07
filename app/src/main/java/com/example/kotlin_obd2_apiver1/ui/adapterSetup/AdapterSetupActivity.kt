package com.example.kotlin_obd2_apiver1.ui.adapterSetup

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothSocket
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast.*
import androidx.appcompat.app.AppCompatActivity
import java.io.OutputStream


private val bluetoothAdapter : BluetoothAdapter? = null //Bluetooth通信を行うために必要な情報を格納する

private val mBTDevice: BluetoothDevice? = null //実際に通信を行うデバイスの情報を格納する

private val mBTSocket: BluetoothSocket? = null //ソケット情報を格納する

private val mOutputStream: OutputStream? = null //出力ストリーム


private val btnSend //送信用ボタン
        : Button? = null
private val btnFinish //終了用ボタン
        : Button? = null
private val textview //MacAddress表示用
        : TextView? = null
private const val MacAddress = "○○:○○:○○:○○:○○:○○" //アルファベットは全て大文字出ないとエラーになる

private const val MY_UUID = "00001101-0000-1000-8000-00805F9B34FB" //通信規格がSPPであることを示す数字


class AdapterSetupActivity : AppCompatActivity() {

    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.kotlin_obd2_apiver1.R.layout.activity_adapter_setup)

        val pairedDevices: Set<BluetoothDevice>? = bluetoothAdapter?.bondedDevices
        pairedDevices?.forEach { device ->
            val deviceName = device.name
            val deviceHardwareAddress = device.address // MAC address
        }

    }
}






