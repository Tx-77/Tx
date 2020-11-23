package com.tx;

import java.util.Scanner;

public class MathCoordinates {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请输入1");
			int a=scanner.nextInt();
			if(a==1){
				int y=(int)(Math.random()*100%100);
				int x=(int)(Math.random()*100%100);
				System.out.println("坐标"+y+","+y+")");
			}else {
				System.out.println("乱来，重新输入");
			}
		}
	}

}
