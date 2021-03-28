package demo;

import java.util.Scanner;

public class Hello{
  	public static void main(String [] args) {
	 Scanner in = new Scanner(System.in);
		int number=in.nextInt();
		int frequency = 0;  //lnitialize
		 do{
			number/=10;
			frequency++;
			System.out.println("number="+number+"frequency="+frequency);
		}while(number>0);
	System.out.println("该数字位数为："+frequency);
	}
	
}