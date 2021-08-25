package vTiger.Generic_Libraries;

import java.util.Random;

public class AccessRandom {
	public int getRandomNumber(int numberRange)
	{
		Random random=new Random();
		int randomNumber = random.nextInt(numberRange);
		return randomNumber;
		
	}
	

}
