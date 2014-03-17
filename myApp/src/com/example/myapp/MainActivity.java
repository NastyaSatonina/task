package com.example.myapp;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends ActionBarActivity {
Runnable r;
Handler handler;

	@Override    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        startHomeScreen();
	}

	private void startHomeScreen() {
		
         handler = new Handler();
		 r = new Runnable() {  
		 @Override
		 public void run() {
		 Intent InHome = new Intent(MainActivity.this,Home_screen.class);
		 MainActivity.this.startActivity(InHome);
		 }};
		 handler.postDelayed(r,2000) ;
	}


	@Override
	protected void onPause() {
	  super.onPause();  
	  handler.removeCallbacks(r);
	}

}

