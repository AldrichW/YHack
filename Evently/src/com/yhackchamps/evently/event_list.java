package com.yhackchamps.evently;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle; 
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ScrollView;
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
		event.setDate("Monday November 21,  2013");
		
		LinearLayout parentLayout = (LinearLayout)findViewById(R.id.parentLayout);
        LinearLayout [] lLayout = new LinearLayout[8];
        
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 200);
        
        params.setMargins(0, 30, 0, 0);
        
        for(int i = 0; i < lLayout.length; i++) {
            lLayout[i] = new LinearLayout(this);
            TextView event_name= new TextView(this);
            event_name.setTextSize(24);
            TextView category= new TextView(this);
            category.setTextSize(20);
            TextView date = new TextView(this);
            date.setTextSize(20);
            lLayout[i].setId(i);
            lLayout[i].setOrientation(LinearLayout.VERTICAL);

            if(i%2 == 0) {
                lLayout[i].setBackgroundColor(Color.GRAY);
   
            } else {
                lLayout[i].setBackgroundColor(Color.WHITE);
            }
            event_name.setText(event.getEventName());
            
            category.setText(event.getCategory());
            
            date.setText(event.getDate());
   
            parentLayout.addView(lLayout[i]);
            lLayout[i].addView(event_name, params);
            lLayout[i].addView(category, params);  
            lLayout[i].addView(date, params);  
        }
		
	}

}
