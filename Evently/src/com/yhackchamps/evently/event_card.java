package com.yhackchamps.evently;

import android.content.Context;
import android.view.View;

public class event_card extends View {
	
	public event_card(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		
		event_name = category = unitprice = location=date=null;
					
	}

	private String event_name;
	
	private String category;
	
	private String unitprice;
	
	private String location; 
	
	private String date;
	
	
	public void setEventName(String _event_name){
		event_name = _event_name;
	}
	
	public void setCategory(String _category){
		category = _category;
	}
	
	public void setPrice(String _price){
		unitprice = _price;
	}
	
	public void setLocation(String _location){
		location = _location;
	}
	
	public void setDate (String _date){
		date = _date;
	}	
	
	public String getEventName(){
		return event_name; 
	}
	
	public String getCategory(){
		return category;
	}
	
	public String getPrice(){
		return unitprice;
	}
	
	public String getLocation(){
		return location;
	}
	
	public String getDate(){
		return date;
	}	
}
