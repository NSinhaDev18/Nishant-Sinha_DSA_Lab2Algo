package com.glearning.client;
import java.util.Arrays;
import java.util.Scanner;
import com.glearning.service.CurrencyDenominationService;

public class CurrencyClient {
	
	public static void main(String[] args) {
		CurrencyDenominationService service = new CurrencyDenominationService();
		System.out.println("Please enter the count(different types of denomination) of denominations present in the currency: ");
		Scanner sc= new Scanner(System.in);
		int size= sc.nextInt();
		int[] denominators = new int[size];
		//enter the denomination values
		System.out.println("Please enter the denomination values one by one and press enter");
		for(int i=0; i<size; i++) {
			denominators[i]=sc.nextInt();
		}
		//sorting the denomination values
		Arrays.sort(denominators);
		reverse(denominators);
		System.out.print("The denominations in the currency are: ");
		for(int i=0; i<size; i++) 
		{
			System.out.print(denominators[i]+" ");
		}
		System.out.println();
		//Enter the amount payable
		System.out.println("Please enter the amount that you want to pay using the currency: ");
		int amountPayable= sc.nextInt();
	
		service.denominatorService(denominators, amountPayable);
	}

	private static void reverse(int[] denominators) 
	{
		// TODO Auto-generated method stub
		int n = denominators.length;
		
		for (int i = 0; i < n / 2; i++) 
		{
        	int temp = denominators[i];
            denominators[i] = denominators[n - i - 1];
            denominators[n - i - 1] = temp;
		}
	}
}
