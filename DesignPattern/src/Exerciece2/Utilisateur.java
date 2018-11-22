package Exerciece2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Utilisateur {
	
	 static ArrayList<Connectable> addConnect =new ArrayList<Connectable>();
	
	public static void main(String []args) {

		
		
		System.out.println("saisie un numero ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number==1) {
			Connectable cafetiere=new Cafetiere();
			addConnect.add(cafetiere);
			 
		}
		
		
		
	}
	

}
