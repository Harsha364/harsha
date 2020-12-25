package com.anno;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	/*	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + "]";
	}
	   */
	
	public void garage(){
	System.out.println("Bike is repaired");
}
}
