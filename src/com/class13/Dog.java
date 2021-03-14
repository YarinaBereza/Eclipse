package com.class13;

public class Dog {
	
	public String breed;
	public String size;
	public String color;
	public int age;
	
	
	public void bark() {
		System.out.println("boo boo boo");
	}
	
	public void sleep() {
		System.out.println("Zzzzzzzzzzz....");
	}
	
	public void eat() {
		for(int i=0;i<5;i++) {
		System.out.println("Omnomnom....");
		}
	}
	
	public void look() {
		System.out.println("Hi I am a dog my color is "+color);
	}
	

	public static void main(String[] args) {
		
		Dog BullDog = new Dog();
		
		BullDog.age = 10;
		BullDog.breed = "American Bulldog";
		BullDog.size = "Large";
		BullDog.color = "white";
		BullDog.bark();
		BullDog.eat();
		BullDog.sleep();
		BullDog.look();
		
		
		
		
		Dog Labrador = new Dog();
		
		BullDog.age = 8;
		BullDog.breed = "Retriver";
		BullDog.size = "Medium";
		BullDog.color = "black";
		
		BullDog.look();
		
		
		
		
		
		
		

	}

}
