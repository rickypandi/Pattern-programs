package com.pattern.program.mycode;

public class Pattern4 {
	public static void main(String[] args) {
		for(int row=5;row<=0;row--){
			for(int data=5;data>=row;data--) {
				System.out.print(data);
			}
			System.out.println();
		}
	}

}
