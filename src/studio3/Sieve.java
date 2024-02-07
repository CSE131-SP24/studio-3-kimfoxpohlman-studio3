package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("What is the highest number in the sieve: ");
		int n = scanner.nextInt();

		// building array to store prime numbers
		// boolean[] isPrime = new boolean [n+1];
		// Initialize all elements to true
		// build array
		int[] sieve = new int[n];
		for (int i = 0; i < n; i++) {
			sieve[i] = i + 1;
		}

		for (int i = 2; i <= n; i++) {
			// (isPrime[i] = true)

			for (int j = 2; j <= n / i; j++) {
				sieve[j * i - 1] = 0;
			}

		}

		for (int i = 0; i < n; i++) {
			if (sieve[i] != 0) {
				System.out.print(sieve[i] + " ");
			}
		}
	}

}
