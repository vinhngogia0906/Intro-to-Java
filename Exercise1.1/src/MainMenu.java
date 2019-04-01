import java.util.*;

public class MainMenu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DisplayMessages ex1 = new DisplayMessages();
		ILoveJava ex2 = new ILoveJava();
		DisplayPattern ex3 = new DisplayPattern();
		DisplayPower ex4 = new DisplayPower();
		ComputeExpre ex5 = new ComputeExpre();
		SumOfSeries ex6 = new SumOfSeries();
		FourPi ex7 = new FourPi();
		AreaAndPerimeter ex8 = new AreaAndPerimeter();
		Rectangle ex9 = new Rectangle();
		AvaSpeed ex10 = new AvaSpeed();
		Population ex11 = new Population();
		AvaSpeed2 ex12 = new AvaSpeed2();
		// TODO Auto-generated method stub
		System.out.println("Welcome to Java Excercise chapter 1!");
		System.out.println("Please enter the number from 1 to 12 to run the corresponding exercise");
		int choice = input.nextInt();
		switch (choice) {
			case 1: {
				ex1.displayMessages();
				break;
			}
			case 2: {
				ex2.printMess();
				break;
			}
			case 3: {
				ex3.displayPattern();
				break;}
			case 4: {
				ex4.displayPower();
				break;}
			case 5: {
				ex5.computeExpre();
				break;}
			case 6: {
				ex6.calculate();
				break;}
			case 7: {
				ex7.compute();
				break;}
			case 8: {
				ex8.compute();
				break;}
			case 9: {
				ex9.compute();
				break;}
			case 10: {
				ex10.compute();
				break;}
			case 11: {
				ex11.compute();
				break;}
			case 12: {
				ex12.compute();
				break;}
			default: {
				System.out.println("Invalid Input");
			}
		} 
		
	}

}
