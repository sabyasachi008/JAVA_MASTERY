package lecture_33;

import java.util.Scanner;

public class Prime_Sieve_Algorithm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		printPrime(n);
		
	}
	
	//here true means not prime
	//false means prime
	public static void printPrime(int n) {
		boolean[] prime = new boolean[n+1];			//take a boolean array to store the prime numbers 
													//n+1 element because we will iterate till last element also.
		
		prime[0] = true;	//0 is not a prime number
		prime[1] = true;	//1 is not a prime Number
		
		for(int i = 2; i*i<n; i++) {
			if(prime[i] == false) {				//for each prime number remove it multiples
				
				for(int mul = 2; i*mul <= n; mul++) {		//for each multiplier of i set the boolean array true
					prime[mul*i] = true;				
				}
			}
		}
		
		
		//Normally print 1-D Array
		for(int i = 0; i<prime.length; i++) {
			if(prime[i] == false) {			//for every i is prime number
				
				System.out.print(i+" ");
				
			}
		}
	}
}
