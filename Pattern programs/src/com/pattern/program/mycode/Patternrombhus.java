package com.pattern.program.mycode;
 class Patternrombhus {
	public static void main(String[] args) {
		int data=9;
		int space=1;
		int row=5;
		for(int r=1;r<=row;r++){
			for(int s=1;s<space;s++){
				System.out.print(" ");
			}
			for(int d=1;d<=data;d++) {
				System.out.print("*");
			}
			data=data-2;
			space++;
			System.out.println();
			}
		}
	}
