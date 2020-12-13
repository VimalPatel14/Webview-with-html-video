package com.vimal.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewTextActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_text);

        WebView webView2 = findViewById(R.id.webview);
        this.webView = webView2;
        webView2.setWebViewClient(new MyBrowser());
        this.webView.setWebChromeClient(new WebChromeClient());
        this.webView.getSettings().setLoadsImagesAutomatically(true);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setAllowFileAccess(true);
        this.webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        this.webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.webView.getSettings().setPluginState(WebSettings.PluginState.ON);
//        webView.setBackgroundColor(getResources().getColor(R.color.teal_700));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            this.webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }

        webView.loadData("Paste Your url here which includes Text", "text/html", "UTF-8");
    }

    private class MyBrowser extends WebViewClient {
        private MyBrowser() {
        }

        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}