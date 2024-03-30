public class Car {
	private int fuel;
	private int fuelCapacity;
	private float litersPerKm;

	public Car(int fuel,int fuelCapacity, float litersPerKm){
		this.fuel = fuel;
		this.fuelCapacity = fuelCapacity;
		this.litersPerKm = litersPerKm;
	}
	public float percent(){
		float res;
		res = ((float)fuel/fuelCapacity) * 100;
		return res;
	}
	public boolean urgentGasStation(){
		boolean res = false;
		if (this.percent() < 10 || this.fuel < 20){
			res = true;
		}
		return res;
	}
	public boolean drive(int km){
		boolean res = false;
		if (km * litersPerKm <= fuel){
			float removeKM = ((float) km * litersPerKm);
			this.fuel -= (int)removeKM;
			res = true;
		}
		return res;
	}
	public String toString(){
		return getClass().getSimpleName() + "---> Current gas: " + fuel
				+ ", Fuel capacity: " + fuelCapacity;
	}

}
