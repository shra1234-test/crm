package com.pratice;

import java.util.Random;

public class GerenerateRandomNum {

	public static void main(String[] args) {
      
		Random random = new Random();
		 int randomInt = random.nextInt(1000);
		 System.out.println(randomInt);

	}

}
