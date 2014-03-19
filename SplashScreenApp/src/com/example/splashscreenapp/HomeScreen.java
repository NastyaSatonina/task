package com.example.splashscreenapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeScreen extends ActionBarActivity {
	private ListView listViewHomeScreen;
	private String arrayForList[] = { "Apple", "Nokia", "Samsung", "HTS",
			"Sony", "Motorola", "LG", "Pantech", "Philips", "Huawei", "Arcer",
			"Alcatel", "ASUS", "BlackBerry", "Fly", "Gigabyte", "Jast5",
			"Vertu", "iTravel", "RoverPC" };
	ArrayAdapter<String> adapterListView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_screen);
		listViewHomeScreen = (ListView) findViewById(R.id.listHomeScreen);
		adapterListView = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, arrayForList);
		listViewHomeScreen.setAdapter(adapterListView);
	}
}
