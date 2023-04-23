package com.app21efullpyramidfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebView extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_web_view);

        webView = findViewById(R.id.web_view);
        webView.loadUrl("https://www.flipkart.com/");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
//        webView.setWebViewClient(new WebViewClient());

        webView.setWebViewClient(new webClass());
    }

    private class webClass extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String request) {

            view.loadUrl(request);
            return  true;
//            return super.shouldOverrideUrlLoading(view, request);
        }
    }


    @Override
    public void onBackPressed() {
//        super.onBackPressed();

        if(webView.canGoBack())
        {
            webView.goBack();
        }else{
            finish();
        }
    }
}