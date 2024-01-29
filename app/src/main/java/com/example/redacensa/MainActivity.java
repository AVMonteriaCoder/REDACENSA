package com.example.redacensa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;
    private WebSettings myWebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebView = findViewById(R.id.web1);
        myWebSettings = myWebView.getSettings();
        myWebSettings.setJavaScriptEnabled(true);
        myWebSettings.setDomStorageEnabled(true);
        myWebView.loadUrl("https://sites.google.com/censa.edu.co/redacensa/categorías?authuser=0");
        myWebView.setWebViewClient(new WebViewClient());
    }
    @Override

    public void onBackPressed(){
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        }else{
            super.onBackPressed();
        }

        }
}
