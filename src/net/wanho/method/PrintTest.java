package net.wanho.method;

import java.util.Scanner;

public class PrintTest {
		public static void printTest(int a){
			for(int i=0;i<a;i++){
				for(int j=0;j<=i;j++){
					System.out.print(i+1);
				}
				System.out.println();
			}
		}
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			int a=0;
			while(a<=0){
				System.out.println("行数");
				a=input.nextInt();
			}
			printTest(a);
		}
}
