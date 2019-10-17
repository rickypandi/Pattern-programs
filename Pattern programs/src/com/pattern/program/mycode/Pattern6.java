package com.pattern.program.mycode;

public class Pattern6 {
	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int data=1;data<=row;data++) {
				if(row==data||data==1){
				System.out.print(data);
					}
				else if(row==5){
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
