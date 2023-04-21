package mockprogram;

public class PalindromNumber {
	public static void main(String[] args) {
		int a;
		int sum=0;
		int n = 121;
		int tem = n;

		while (n > 0) {
			a = n % 10;
			sum = (sum * 10) + a;
			n = n / 10;
		}
		if (tem == sum)
			System.out.println("number is pallindrome");
		else
			System.out.println("number is not pallindrome");

	}

}

