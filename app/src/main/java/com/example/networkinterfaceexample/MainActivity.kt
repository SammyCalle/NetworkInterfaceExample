package com.example.networkinterfaceexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import java.net.Inet4Address
import java.net.InetAddress
import java.net.NetworkInterface
import java.util.*

class MainActivity : AppCompatActivity() {

    private var ip : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ip = NetworkUtil.getIPAddress(true)
        var ipv4 = NetworkUtil.getIPAddressIpv4()
        Log.d("-->", "La ip es : " + ipv4)
    }



}