package com.tlequoise.homesecuritysystem;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;



public class HomeScreen extends AppCompatActivity {

    private WebView mWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        mWebview  = new WebView(this);
        mWebview.getSettings().setJavaScriptEnabled(true);
        final Activity activity = this;

        mWebview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });

        mWebview.loadUrl("http://192.168.0.29:8081");
        setContentView(mWebview);
    }
}
