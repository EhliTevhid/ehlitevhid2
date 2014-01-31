package com.ehlitevhid.forum;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		 WebView webView = (WebView)findViewById(R.id.webView);
	        webView.setWebChromeClient(new WebChromeClient());
	        webView.loadUrl("file:///android_asset/www/index.htm");
	    }
	}

