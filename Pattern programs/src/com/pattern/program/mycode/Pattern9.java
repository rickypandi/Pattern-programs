package com.pattern.program.mycode;

public class Pattern9 {
	public static void main(String[] args) { 
		for(int row=5;row>=1;row--){
			for(int data=row;row<=5;row++) {
				if(row==data) {
					System.out.print(data);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
