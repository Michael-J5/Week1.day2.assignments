package week1.day2.assignments;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator obj1 = new Calculator();
		int sum = obj1.add(3, 6, 5);
		System.out.println(sum);
		int sub = obj1.sub(10, 2);
		System.out.println(sub);
		double mul = obj1.mul(2.5, 4);
		System.out.println(mul);
		float divide = obj1.divide(10f, 2.5f);
		System.out.println(divide);
	}
}
