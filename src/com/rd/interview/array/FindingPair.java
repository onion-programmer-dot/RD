package com.rd.interview.array;

import java.io.IOException;
import java.util.Scanner;

public class FindingPair {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {

		int pairCount = 0;

		for (int i = 0; i < ar.length; i++) {
			int numCount = 1;
			if (ar[i] != -1) {
				for (int j = i + 1; j < ar.length; j++) {
					if (ar[i] == ar[j]) {
						numCount++;
						ar[j] = -1;
					}
				}

				pairCount = pairCount + numCount / 2;
			}
		}
		return pairCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		int arr[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		
		int sockMerchant = sockMerchant(9, arr);
		
		System.out.println("sockMerchant "+ sockMerchant);
		
		/*
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	*/}
}
