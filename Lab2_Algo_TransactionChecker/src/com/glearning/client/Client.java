package com.glearning.client;
import java.util.Scanner;
import com.glearning.service.TransactionService;

public class Client {

	public static void main(String[] args) {
		int target= 1000;
		
		boolean flag= false;
		TransactionService tranService = new TransactionService();
		System.out.println("Please note that the target transaction value for the date at PayMoney is set at 1000.");
		System.out.println();
		System.out.println("Plese enter the number of transactions for the day to be processed by PayMoney: ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] transactionArray= new int[size];
		System.out.println("Please enter the "+size+" transaction values:");
		for(int i=0; i<transactionArray.length; i++) {
			System.out.print("Enter the transaction value at position " +(i+1)+": ");
			transactionArray[i]=sc.nextInt();
		}
		tranService.checkTransactionTarget(transactionArray, target, flag);
			
	}

	


}