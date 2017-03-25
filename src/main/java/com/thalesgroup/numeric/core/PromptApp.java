package com.thalesgroup.numeric.core;

import java.util.Scanner;

public class PromptApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			String str = "";
			System.out.print("> ");
			while (scan.hasNextLine() && !((str = scan.nextLine()).toLowerCase().equals("exit"))) {
				System.out.println(str);
				System.out.print("> ");
			}
		} finally {
			scan.close();
		}
	}
}