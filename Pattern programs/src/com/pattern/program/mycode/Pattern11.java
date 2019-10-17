package com.pattern.program.mycode;

public class Pattern11{
	public static void main(String[] args) {
		for(int row=1;row<=5;row++){
			if(row==1||row==3||row==5){
				for(int data=5;data>=1;data--){
					if(data==2||data==4) {
						System.out.print("*");
					}
					else {
						System.out.print(data);
					}
				}
			}
			if(row==2||row==4){
				for(int data=1;data<=5;data++) {
					if(data==2||data==4){
						System.out.print("*");
					}
					else {
						System.out.print(data);
					}
				}
			}
			
			System.out.println();
		}
	}
	

}
