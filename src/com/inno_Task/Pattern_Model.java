package com.inno_Task;

public class Pattern_Model {
	public static void triangle() {
		System.out.println("Triangle: ");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println(" ");
		}

	}

	public static void ReverseTriangle() {
		System.out.println();
		System.out.println("Reverse Pattern: ");
		for (int i = 9; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void NumberPattern() {
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
		}
	}

	public static void ReverseNum() {
		System.out.println();
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		triangle();
		ReverseTriangle();
		NumberPattern();
		ReverseNum();

	}
}
