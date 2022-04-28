package com.example.controller;
import java.util.ArrayList;
import java.util.List;
public class firstprogram {
	
		public boolean is_success;
		public String user_id;
		public String email;
		public String roll_number;
		public List<Integer> number=new ArrayList<>();
		public List<String> alphabets=new ArrayList<>();
		
		public void REST() 
		{
			is_success=true;
			user_id="john_doe_17091999";
			email="john@xyz.com";
			roll_number="ABCD123";
		}
}
