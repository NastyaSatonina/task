package com.example.splashscreenapp;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends ActionBarActivity {
	Runnable launchHomeScreenRunnable;
	Handler handler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		launchHomeScreen();
	}

	private void launchHomeScreen() {

		handler = new Handler();
		launchHomeScreenRunnable = new Runnable() {
			@Override
			public void run() {
				Intent HomeScreenStart = new Intent(SplashScreen.this,
						HomeScreen.class);
				SplashScreen.this.startActivity(HomeScreenStart);
			}
		};

		handler.postDelayed(launchHomeScreenRunnable, 2000);
	}

	@Override
	protected void onPause() {
		super.onPause();
		handler.removeCallbacks(launchHomeScreenRunnable);
	}
}
