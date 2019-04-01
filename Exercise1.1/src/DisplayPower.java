
public class DisplayPower {
	public void displayPower() {
		System.out.println("a\ta^2\ta^3\ta^4");
		for (int i = 1; i <= 4 ; i++) {
			System.out.println(i+"\t"+i*i+"\t"+i*i*i+"\t"+i*i*i*i);
		}
	}
}
