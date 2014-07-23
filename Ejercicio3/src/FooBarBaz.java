
public class FooBarBaz {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 3*5*7) {
			System.out.print(i + ". ");

			if (i % 3 == 0)
				System.out.print("foo ");
			if (i % 5 == 0)
				System.out.print("bar ");
			if (i % 7 == 0)
				System.out.print("baz ");
			
			System.out.print("\n");
			i++;
		}
	}
}
