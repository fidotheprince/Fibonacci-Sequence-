package fibosequence;

import java.util.Scanner;

public class fibosequence {

// 0(n1), 1(n2), 1(sum),
// 0, 1(n1), 1(n2), 2(sum)
// 0, 1, 1(n1), 2(n2), 3(sum)
// 0, 1, 1, 2(n1), 3(n2), 5(sum)
// 0, 1, 1, 2, 3(n1), 5(n2), 8(sum)
//
	static void sequence(int number) {
		
		//max defines how many numbers to print
		int max = 10;
		//n1 is the first number
		int n1 = 0;
		//n2 is the second number 
		int n2 = number;
		//corresponding loop 
		for (int i = 1; i <= max; i++) {
			System.out.print(n1 + " ");
			//1 = 0 + 1
			//int sum holds current sums value 
			int sum = n1 + n2;
			// 1 = n1
			n1 = n2;
			// 1 = n2 one is the old sum 
			n2 = sum;
		}
	
	};

	static void picknumber() {
		

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		if (x == 1) {
			sequence(x);
		} else if (x == 2) {
			sequence(x);
		} else if (x == 3) {
			sequence(x);
		} else if (x == 4) {
			sequence(x);
		} else if (x == 5) {
			sequence(x);
		} else {
			System.out.println("I'm sorry, that input is not valid.");
		}
		
	};
	
	public static void main(String[] args){
		
		System.out.println("Hello user, please select a number between 1-5, to continue the Fibonacci Sequence.");
		picknumber();

	};

}
