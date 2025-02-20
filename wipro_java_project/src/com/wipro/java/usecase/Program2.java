package com.wipro.java.usecase;

import java.util.*;

public class Program2 {
	public static int countPairs(int N, int[] A) {
		int count = 0;

		// Iterate over all possible pairs (i, j)
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int minHeight = Math.min(A[i], A[j]);
				boolean isValid = true;

				// Check heights in between (i, j)
				for (int k = i + 1; k < j; k++) {
					if (A[k] >= minHeight) {
						isValid = false;
						break;
					}
				}

				if (isValid) {
					count++;
				}
			}
		}

		return count;
	}

	// Non-editable main method
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		int[] A = new int[N];
		String[] temp = scanner.nextLine().split(" ");
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(temp[i]);
		}
		scanner.close();
		System.out.println(countPairs(N, A));
	}
}
