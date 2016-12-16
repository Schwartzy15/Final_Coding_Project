package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

import rocketDomain.RateDomainModel;

public class rate_test {

	@Test
	public void Rate_test() {
		ArrayList <RateDomainModel> allRates= RateDAL.getAllRates();
			System.out.println("Rate's size: "+ allRates.size());
		assert(allRates.size()>0);
		
		assertEquals(allRates.get(0).getdInterestRate(), 5.00, 0.01);
		assertEquals(allRates.get(1).getdInterestRate(), 4.50,  0.01);
		assertEquals(allRates.get(2).getdInterestRate(), 4.00,  0.01);
		assertEquals/*Ninja Comment*/(allRates.get(3).getdInterestRate(), 3.75, 0.01);
		assertEquals(allRates.get(4).getdInterestRate(), 3.50,  0.01);	
		
	}
	@Test
	public void test() {
		
		ArrayList <RateDomainModel> rate= RateDAL.getAllRates();
			System.out.println("Rate's size: "+ rate.size());
		assert(rate.size()>0);
	}
}
