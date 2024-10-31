package com.zking.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//定义一个字符串变量，赋值自己的名字，然后打印
		final String name = "易远志";
		System.out.println(name);
		
//		name = "夏星星";
//		System.out.println(name);
		
		System.out.println("=======条件分支========");
		int i = 10;
		if(i>5) {
			System.out.println("大于5");
		}
		
		System.out.println("==============");
		
		if(i>50) {
			System.out.println("大于50");
		}else {
			System.out.println("不大于50");
		}
		
		System.out.println("===============");
		int cj = 59;
		//60  <60  >60
		if(cj<60) {
			System.out.println("小老弟 还得练");
		}else if(cj==60) {
			System.out.println("小老弟 你是控分大佬呀");
		}else {
			System.out.println("装备大佬");
		}
		
		System.out.println("===============");
		//键盘输入一个1--7的数字，打印对应的周几
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入一个数字");
//		int n = sc.nextInt();
//		switch(n) {
//			case 1:System.out.println("周1"); break;
//			case 2:System.out.println("周2"); break;
//			case 3:System.out.println("周3"); break;
//			case 4:System.out.println("周4"); break;
//			case 5:System.out.println("周5"); break;
//			case 6:System.out.println("周6"); break;
//			case 7:System.out.println("周7"); break;
//			default:System.out.println("你似不似撒，7以内呦");
//		}
		
		System.out.println("========循环流程=========");
		System.out.println("=======while=====");
		int j=1;
		while(j>=10) {
			System.out.println(j);
			j++;
		}
		
		System.out.println("======do...while========");
		int j2 = 1;
		do {
			System.out.println(j2);
			j2++;
		}while(j2>=10);
		
		//循环求出1--100之间所有整数之和
		int dou = 0;
		for(int k=1;k<=100;k++) {
			dou = dou+k;
		}
		System.out.println(dou);
		
	}
}
