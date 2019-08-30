package com.conv;

public class IndToEuro implements CurrencyConverter {
	public double convert(double amount)
	{
	return 0.013*amount;
	}
}
