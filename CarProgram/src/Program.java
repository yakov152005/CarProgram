import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Car[] cars = new Car[3];
		addCars(cars);
		printCars(cars);
		System.out.println();
		int result = maximumAmountKilometersWithoutRunningOutGas(cars);
		System.out.println("The maximum amount kilometers is: " + result);
		printCars(cars);
	}
	public static int maximumAmountKilometersWithoutRunningOutGas(Car[] cars){
		int countMax = 0;
		for (int i = 0; i < cars.length; i++) {
			while (cars[i].percent() >= 0){
				if (cars[i].drive(1)){
					countMax++;
				}else {
					break;
				}
			}
		}
		return countMax;
	}
	public static void addCars(Car[] cars){
		int fuel, fuelCapacity;
		float litersPerKm;
		for (int i = 0; i < cars.length; i++) {
			System.out.println("Enter details for car " + (i+1) +"--->");
			System.out.print("Current gas: ");
			fuel = s.nextInt();
			System.out.print("Fuel capacity: ");
			fuelCapacity = s.nextInt();
			System.out.print("Liters per Km: ");
			litersPerKm = s.nextFloat();
			cars[i] = new Car(fuel,fuelCapacity,litersPerKm);
		}
	}
	public static void printCars(Car[] cars){
		for (int i = 0; i < cars.length; i++) {
			System.out.println("Details for car " + (i+1) + "--->");
			System.out.print(cars[i]);
			System.out.println();
		}
	}
	public static void check(){
		Car car = new Car(100,400,0.1f);
		System.out.println(car.percent());
		Car car1 = new Car(19,70,1);
		System.out.println(car1.urgentGasStation());
		Car car2 = new Car(10, 20,1);
		System.out.println(car2);
		car2.drive(8);
		System.out.println(car2);
		car2.drive(3);
		System.out.println(car2);
	}
	public static Scanner s = new Scanner(System.in);
}
