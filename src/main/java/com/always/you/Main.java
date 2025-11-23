package com.always.you;

public class Main {

	public static void main(String[] args) {
		User bag = User.builder() 
					.name("name")
		        	.money(1000)
		        	.memo("memo")
		        	.build();
		
		System.out.println(bag.toString());

	}

}
