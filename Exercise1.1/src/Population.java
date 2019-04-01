
public class Population {
	public void compute() {
		int timeInSec = 365*24*3600;
		long population = 312032486;
		System.out.println("The population in the next five years are : ");
		for (int i = 1; i <= 5; i++) {
			System.out.println((long)(population + timeInSec*i*(1.0/7 + 1.0/45 - 1.0/13)));
		}
	}
}
