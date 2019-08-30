package com.conv;

public class IndToDollar implements CurrencyConverter{
	public double convert(double amount)
	{
		return 0.014*amount;
	}
}
