package com.example.networkinterfaceexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.net.Inet4Address
import java.net.InetAddress
import java.net.NetworkInterface
import java.util.*

class MainActivity : AppCompatActivity() {

    private var ip : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ip = NetworkUtil.getIPAddress(true)
        Log.d("-->", "La ip es : " + ip)
    }



}