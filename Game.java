package com.noah;
import java.util.*;
import com.noah.Compare;
public class Game {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("������Black��ӵ�е���");
		String Black = in.nextLine();
		@SuppressWarnings("resource")
		Scanner in2 = new Scanner(System.in);
		System.out.println("������White��ӵ�е���");
		String White = in2.nextLine();
		System.out.println(Compare.compare(Black,White)+" win");
	}
}
