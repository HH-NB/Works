package com.zking.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//����һ���ַ�����������ֵ�Լ������֣�Ȼ���ӡ
		final String name = "��Զ־";
		System.out.println(name);
		
//		name = "������";
//		System.out.println(name);
		
		System.out.println("=======������֧========");
		int i = 10;
		if(i>5) {
			System.out.println("����5");
		}
		
		System.out.println("==============");
		
		if(i>50) {
			System.out.println("����50");
		}else {
			System.out.println("������50");
		}
		
		System.out.println("===============");
		int cj = 59;
		//60  <60  >60
		if(cj<60) {
			System.out.println("С�ϵ� ������");
		}else if(cj==60) {
			System.out.println("С�ϵ� ���ǿطִ���ѽ");
		}else {
			System.out.println("װ������");
		}
		
		System.out.println("===============");
		//��������һ��1--7�����֣���ӡ��Ӧ���ܼ�
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������һ������");
//		int n = sc.nextInt();
//		switch(n) {
//			case 1:System.out.println("��1"); break;
//			case 2:System.out.println("��2"); break;
//			case 3:System.out.println("��3"); break;
//			case 4:System.out.println("��4"); break;
//			case 5:System.out.println("��5"); break;
//			case 6:System.out.println("��6"); break;
//			case 7:System.out.println("��7"); break;
//			default:System.out.println("���Ʋ�������7������");
//		}
		
		System.out.println("========ѭ������=========");
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
		
		//ѭ�����1--100֮����������֮��
		int dou = 0;
		for(int k=1;k<=100;k++) {
			dou = dou+k;
		}
		System.out.println(dou);
		
	}
}
