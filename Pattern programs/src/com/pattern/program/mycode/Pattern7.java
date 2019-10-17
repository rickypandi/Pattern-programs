package com.pattern.program.mycode;

public class Pattern7 {
	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int data=1;data<=5;data++){
				if(row==1||row==5) {
				System.out.print("*");
			}
				else if(data==1||data==5) {
					System.out.print(" ");
				}
				 else{
					System.out.print("*");
				}
				
		}
			System.out.println();
	}

}
}
