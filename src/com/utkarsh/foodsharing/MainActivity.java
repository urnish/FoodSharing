package com.utkarsh.foodsharing;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	protected ListView lvMain;
	private String[] items = new String[] {"Resturant", "Hotels", "Bars", "Orphanage"}; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
<<<<<<< HEAD
		lvMain = (ListView) findViewById(R.id.lvMain);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, items);
		lvMain.setAdapter(adapter);
=======
		//some modifications
>>>>>>> 5fc893fd311b6f35ab4b06161525639ee2a4cf94
	}
	
	

	
}
