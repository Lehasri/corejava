package com.chainsys.introduction;

public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PrintNumbersOneToTen();
//		PrintNumbersTenToOne();
	//	PrintMatrix();
//PrintTriangleA();
PrintTriangleB();
	}
	public static void PrintNumbersOneToTen() {
		int count = 0;
		for (count = 0; count <= 10; count++) {
			System.out.print(count + " ");
		}
	}
	public static void PrintNumbersTenToOne() {
		int count = 0;
		for (count = 10; count >= 0; count--) {
			System.out.print(count + " ");
		}
	}

	public static void PrintMatrix() {
		int countA = 0;
		for (countA = 1; countA <= 10; countA++) {
			for (int countB = 1; countB <= 10; countB++) {
				System.out.print(countB);
			}
			System.out.println();
		}
	}

	public static void PrintTriangleA() {
		int countA = 0;
		for (countA = 1; countA <= 10; countA++) {
			for (int countB = 1; countB <= countA; countB++) {
				System.out.print(countB);
			}
			System.out.println();
		}
	}

	public static void PrintTriangleB() {
		int countA = 0;
		for (countA = 1; countA <= 10; countA++) {
			for (int countB = 1; countB <= countA; countB++) {
				System.out.print(".");
			}
			for (int countC = countA; countC >= 1; countC--) {
				System.out.print(countC);
			}
			System.out.println();
		}
	}
	
}
	