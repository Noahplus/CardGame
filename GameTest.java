package com.noah;

import junit.framework.TestCase;

public class GameTest extends TestCase
	{
		public void setUp() throws Exception 
		{}
		
		public void tearDown() throws Exception 
		{}

		public void testCardTypestraightflush() 
		{
		     String s1;
		     s1="2D 3D 4D 5D 6D ";
		      CardType instance = new CardType();
		      int expResult1 = 9;
		      @SuppressWarnings("static-access")
			int  result1 = instance.cardType(s1);
		      System.out.println(result1);
		      assertEquals(expResult1, result1);
		 }
		public void testCardTypeThreeofaKind() 
		{
		     String s2;
		     s2="2H 4S 4C 1D 4H ";
		      CardType instance = new CardType();
		      int expResult2 = 4;
		      @SuppressWarnings("static-access")
			int  result2 = instance.cardType(s2);
		      System.out.println(result2);
		      assertEquals(expResult2, result2);
		 }
		public void testCardTypeTwoPairs() 
		{
		     String s3;
		     s3="2C 3H 2S 3C KH ";
		      CardType instance = new CardType();
		      int expResult2 = 3;
		      @SuppressWarnings("static-access")
			int  result2 = instance.cardType(s3);
		      System.out.println(result2);
		      assertEquals(expResult2, result2);
		 }
		
	}


