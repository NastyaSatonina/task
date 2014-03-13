package com.example.myapp;

import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Home_screen extends ActionBarActivity {
	private ListView lv1;
	private String arr[] =
	{ "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
     "11","12","13", "14", "15", "16", "17", "18", "19", "20" };
	ListView lst;
	ArrayAdapter<String> adapter;
	  
	@Override
	protected void onCreate(Bundle savedInstanceState) {	   
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_home_screen);
		
		lv1=(ListView)findViewById(R.id.listView1);
		adapter =  new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , arr);
	    lv1.setAdapter(adapter);	 		  		
		
	    setContentView(R.layout.activity_home_screen);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_home_screen,
					container, false);
			return rootView;
		}
	}
}