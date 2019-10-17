package com.pattern.program.mycode;

public class Pattern5{
	public static void main(String[] args) {
		for(int row=5;row>=1;row--) {
			for(int data=5;data>=row;data--) {
				if(row==data||data==5) {
					System.out.print(data);
				}
				else if(row==1) {
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
