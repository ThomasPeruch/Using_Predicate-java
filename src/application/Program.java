package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Playstation 4",2300.00));
		list.add(new Product("Playstation 3",800.00));
		list.add(new Product("Smarthphone",1500.00));
		list.add(new Product("Notebook",1800.00));
		list.add(new Product("Cabo HDMI",50.00));
		list.add(new Product("Headset",200.00));
				
		list.removeIf(p -> p.getPrice()<1000);
		
		for(Product p: list) {
			System.out.println(p);
		}
	}
}

