package com.demo.service;


public class AddService{
	public int login(String s1,String s2) {
		if(s1.equals("harsha")  && s2.equals("12345")) {
			return 0;
			
		}
		else {
			return 1;
		}
	}
}