package com.noah;

public class CardType {
	public static int cardType(String str) {
		int letter[] = new int[4];
		int number[] = new int[13];
		int n = 1;
		for (int i = 0; i < str.length(); i++) {
			switch (str.substring(i,i+1)) {
			case "D":
				letter[0]++;
				break;
			case "S":
				letter[1]++;
				break;
			case "H":
				letter[2]++;
				break;
			case "C":
				letter[3]++;
				break;
			case "2":
				number[0]++;
				break;
			case "3":
				number[1]++;
				break;
			case "4":
				number[2]++;
				break;
			case "5":
				number[3]++;
				break;
			case "6":
				number[4]++;
				break;
			case "7":
				number[5]++;
				break;
			case "8":
				number[6]++;
				break;
			case "9":
				number[7]++;
				break;
			case "T":
				number[8]++;
				break;
			case "J":
				number[9]++;
				break;
			case "Q":
				number[10]++;
				break;
			case "K":
				number[11]++;
				break;
			case "A":
				number[12]++;
				break;
			default:
				break;
			}
		}
		int m=0,l = 0;
		while(m<9) 
		{

		if(number[m]==1) 
		{
			while (l<m+4) {
				if(number[m]==0)
				{
					m=l+1;
					break;
				}
				else {
					l++;
				}
			}
			break;
		}
		m=m+1;
		}
			if(l-m==4) {
			n=5;}								//顺子
		for(int i=0;i <= 3;i++){
			if(letter[i]==5) {
				int j=0,k = j;
				while(j<9) 
				{
				if(number[j]==1) 
				{
					while (k<j+4) {
						if(number[k]==0)
						{
							j=k+1;
							break;
						}
						else {
							k++;
						}
					}
					break;
				}
				j=j+1;
				}
					if(k-j==4)
					n=9;                            //同花顺
					else {
						n=6;						//同花
					}
				}
		}
		for (int i = 0; i <= 12; i++) {
			if(number[i]==4) {
			n=8;									//铁支
			}
			else if(number[i]==2){
				for(int j=i;j<=12;j++) {
					if(number[j]==3) {
						n=7;
						break;
						}						//葫芦
					else if(number[j]==2) {
						n=3;
						break;
						}							//两对
					else n=2;						//一对
				}
			}
			else if (number[i]==3) {
				for (int j2 = 0; j2 < number.length; j2++) {
					if(number[j2]==2) {
						n=7;						//葫芦
						break;
						}
					else
					{
						n=4;						//三条
					}
				}
			}
			}
		return n;
	}
}
