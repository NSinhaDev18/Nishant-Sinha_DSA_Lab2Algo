package com.glearning.service;
public class TransactionService {
	
	public void checkTransactionTarget(int transactionArray[], int target, boolean flag) {

		int sum=0;
		int i=0; 
		for(;i<transactionArray.length; i++)
		{
		if(sum>=target){
		System.out.println("----Target for the day at PayMoney achieved after "+(i)+"th trasaction----");
		flag=true;
		break;
		}
		else{
		sum=sum + transactionArray[i]; //adding array value
		}
		}
		if(flag==false)
		{
			System.out.println("----Target for the day at PayMoney not achieved after "+i+"th transaction----");
		}
	}
}
