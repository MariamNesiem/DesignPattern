package Decorator;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sandwich sandwich=new BasicSandwich();
		Scanner sc = new Scanner(System.in);   
		System.out.print("SELECT YOUR SANDWICH:\n 1- No Additionals \n 2- Add Cheese \n 3- Add Ranch Sauce \n 4- Add Lettuce \n 5- End \n");  
		int option = sc.nextInt();
		
		while(option == 2 || option == 3 || option ==4) {
			if(option ==2)
				sandwich=new Cheese(sandwich);
			if(option ==3)
				sandwich=new RanchSauce(sandwich);
			if(option ==4)
				sandwich=new Lettuce(sandwich);
			
			System.out.print("ANOTHER ADDITIONS? \n 2- Add Cheese \n 3- Add Ranch Sauce \n 4- Add Lettuce \n 5- End \n");  
			 option = sc.nextInt();
		}
		
		System.out.println(sandwich.getContents());
		System.out.println("Total Price: "+sandwich.getPrice());
	}

}
