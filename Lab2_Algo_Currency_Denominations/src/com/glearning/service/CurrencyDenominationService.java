package com.glearning.service;

import java.util.ArrayList;
import java.util.List;

public class CurrencyDenominationService {

	public void denominatorService(int[] denominators, double amount) 
	{

		boolean flag = true;
		List<String> result = new ArrayList<>();
		while (flag) 
		{
			for (int i = 0; i < denominators.length; i++) 
			{
				int numberOfDenominator = 0;
				while (amount >= denominators[i]) 
				{
					amount = amount - denominators[i];
					numberOfDenominator++;
				}
				if (numberOfDenominator != 0) 
				{
					result
					.add("Number of denominations: " + numberOfDenominator + " for currency: " + denominators[i]);
				}
			}
			flag = false;
		}
		System.out.println("Minimum number of notes that you will be using to pay the net amount are: ");
		System.out.println(result);
	}
}
