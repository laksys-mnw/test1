package com.king;

import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		out.println("-----------main starts----------");
		
		new Thread(
				()-> {
					for(int i=0; i<8; i++)
						out.println("Worer thread...");
				}
			).start();
		
		out.println("--------------main ends-------------");
	}
}
