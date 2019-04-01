
public class FourPi {
	public void compute() {
		System.out.print("Here is the first result: ");
		System.out.println(4*(1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9));
		System.out.print("The second result: ");
		System.out.println(4*(1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/13));
		System.out.print("The third result: ");
		System.out.println(4*(1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/13 + 1.0/15 - 1.0/17 + 1.0/19));
	}
}
