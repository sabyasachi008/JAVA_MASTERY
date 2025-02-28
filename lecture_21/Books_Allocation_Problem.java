/*You are given number of pages in n different books and m students. 
 * The books are arranged in ascending order of number of pages. 
 * Every student is assigned to read some consecutive books. 
 * The task is to assign books in such a way that the maximum number of pages assigned to a 
 * student is minimum.

Input Format
First line contains integer t as number of test cases.
 Next t lines contains two lines. For each test case, 
 1st line contains two integers n and m which represents the number of books and students and 
 2nd line contains n space separated integers which represents the number of pages of n books in ascending order.
Constraints
1<t < 50
1< n < 100
1< m <= 50
1<= A <= 1000
Output Format
Print the maximum number of pages that can be assigned to students.
Sample Input
1
4 2
10 20 30 40*/

package lecture_21;

import java.util.*;

public class Books_Allocation_Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt(); // number of books
			int nos = sc.nextInt(); // number of students
			int[] pages = new int[n];
			for (int i = 0; i < n; i++) {
				pages[i] = sc.nextInt();

			}
			System.out.println(minPages(pages, nos, n));

		}

	}

	public static int minPages(int[] pages, int nos, int n) {

		int low = 0;
		int high = 0;
		for (int v : pages) {
			high = high + v;
		}
		int ans = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (isItpossible(pages, nos, mid) == true) {

				ans = mid;
				high = mid - 1;

			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isItpossible(int[] pages, int nos, int mid) {
		// here mid is the maximum limit
		int i = 0;
		int student = 1;					// first student
		int readpage = 0;
		while (i < pages.length) {

			if (readpage + pages[i] <= mid) {
				readpage += pages[i];
				i++; // move to the next book

			} else {
				student++;
				readpage = 0;

			}
			if(student > nos) {
				return false;
			}
		}

		return true;
	}
}
