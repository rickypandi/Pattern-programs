package com.pattern.program.mycode;

public class Rhombusp{
	public static void main(String[] args) {
		int space=4;
		int data=1;
		int row=5;
		for(int r=1;r<=row;r++) {
			for(int s=1;s<=space;s++) {
				System.out.print(" ");
			}
			for(int d=1;d<=data;d++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			data=data+2;
		}
	}

}
