package com.yhackchamps.evently;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class start extends Activity{

	private String chosenCity;
	
	public String getChosenCity(){
		
		return chosenCity;
	}
	
	public void setChosenCity(String _chosenCity){
		
		this.chosenCity = _chosenCity;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.city_form);
		
		AutoCompleteTextView cityEText= (AutoCompleteTextView)findViewById(R.id.city_form);
		String [] city_array = getResources().getStringArray(R.array.cities_array);
		
		ArrayAdapter <String> adapter = 
		        new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, city_array);
		cityEText.setAdapter(adapter);
		
		Button next_button = (Button)findViewById(R.id.b_next);
		
		next_button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				AutoCompleteTextView cityEText= (AutoCompleteTextView)findViewById(R.id.city_form);
				chosenCity=cityEText.getText().toString();
				
				if (chosenCity.isEmpty()){
					TextView no_input_msg = (TextView)findViewById(R.id.t_no_input);
					no_input_msg.setText("Please enter a city!");
					
				}
				else{
				Intent category_intent = new Intent (start.this, category_activity.class);
				
				startActivity(category_intent);
				}
			}
		});

	}
}
