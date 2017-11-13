package com.example.taruc.lab32toolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        WebView webView = (WebView)findViewById(R.id.WebViewAbout);
        webView.loadUrl("https://developer.android.com/reference/android/util/TypedValue.html");

    }
}
