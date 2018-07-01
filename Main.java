package by.epam.lesson5.hometask;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        
        int k = sc.nextInt();   // get the size of array             
       		
        Fraction[] mas = new Fraction[k];     
		
		Random rand = new Random();
		for(int i=0; i<mas.length; i++) {
			int n, d;
			n = rand.nextInt(100);
			d = rand.nextInt(100);
			mas[i] = new Fraction(n, d);
			System.out.print("mas[" + i + "]="+ n+ "/" + d + " "); 
		}
	}
}
