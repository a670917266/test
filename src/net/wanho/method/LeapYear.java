package net.wanho.method;

import java.util.Scanner;

public class LeapYear {
		public void leap(int a){
			if(a%4==0&&a%100!=0||a%400==0){
				System.out.println(a+"是闰年");
			}
			else{
				System.out.println(a+"不是闰年");
			}
		}
		public static void main(String[] args) {
			LeapYear ly=new LeapYear();
			Scanner input=new Scanner(System.in);
			int a=0;
			while(a<=0){
				System.out.println("请输入年份");
				a=input.nextInt();
			}
			ly.leap(a);
		}
}
