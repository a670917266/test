package net.wanho.method;

import java.util.Scanner;

public class PrimeTest {
		public int prime(int a){
			int b=a/2;
			int c = 0;
			if(a>3){
			for(int i=1;i<b;i++){
				if(a%i!=0){
					c=1;
				}
				else{
					c=0;
				}
			}
			}
			else if(a==2||a==3){
				c=1;
			}
			return c;
			
		} 
		public static void main(String[] args) {
			PrimeTest pt=new PrimeTest();
			Scanner input=new Scanner(System.in);
			int a=0;
			while(a<=0){
				System.out.println("请输入一个大于1的整数");
				a=input.nextInt();
			}
			System.out.println(pt.prime(a));
		}
}
