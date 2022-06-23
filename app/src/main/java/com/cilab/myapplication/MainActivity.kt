package com.cilab.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // WebView实例化
        val mWebView = findViewById<View>(R.id.mWebView) as WebView
        // 开启 javascript 渲染
        mWebView.settings.javaScriptEnabled = true
        // 开启 javascript 弹窗权限
        mWebView.settings.javaScriptCanOpenWindowsAutomatically = true
        mWebView.webViewClient = WebViewClient()
        // 载入内容
        mWebView.loadUrl("file:///android_asset/index.html")
    }
}