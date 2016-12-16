package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) 
	{
		
		ArrayList <RateDomainModel> rates = _RateDAL.getAllRates();
		RateDomainModel rdmRate = null;
		double dRate = -1;
		for (RateDomainModel rate : rates) 
		{
			if (rate.getiMinCreditScore() == GivenCreditScore) 
			{
				dRate = rate.getdInterestRate();
				rdmRate = rate;
			}
		}

		if (rdmRate == null) 
		{
			try {
				throw new RateException(rdmRate);
			} catch (RateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 else
		{
			return dRate;
		}
		return dRate; 		
		
	}
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
