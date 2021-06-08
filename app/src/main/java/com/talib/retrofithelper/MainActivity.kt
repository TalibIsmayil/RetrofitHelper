package com.talib.retrofithelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.talib.retrofit_helper.RetrofitHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val api: API = RetrofitHelper.provideApiService("https://api.safavy.org/")
    }
}