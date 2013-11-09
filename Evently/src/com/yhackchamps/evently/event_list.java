package com.yhackchamps.evently;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle; 
import android.widget.LinearLayout;
import android.widget.TextView;

public class event_list extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.event_list);
		
		event_card event = new event_card(this);
		
		event.setEventName("Drake Tour"); 
		event.setCategory("Music");
		event.setPrice("Free");
		event.setLocation("Toronto, ON");
		event.setDate("Monday", "November", 21,  2013);
		
		LinearLayout parentLayout = (LinearLayout)findViewById(R.id.parentLayout);
        LinearLayout [] lLayout = new LinearLayout[8];
        for(int i = 0; i < lLayout.length; i++) {
            lLayout[i] = new LinearLayout(this);
            TextView event_name= new TextView(this);
            TextView category= new TextView(this);
            lLayout[i].setId(i);
            lLayout[i].setOrientation(LinearLayout.VERTICAL);
            if(i%2 == 0) {
                lLayout[i].setBackgroundColor(Color.GRAY);
   
            } else {
                lLayout[i].setBackgroundColor(Color.WHITE);

            }
            event_name.setText(event.getEventName());
            
            category.setText(event.getCategory());
   
            parentLayout.addView(lLayout[i]);
            lLayout[i].addView(event_name);
            lLayout[i].addView(category);  
        }
		
	}

}
