package test_p26;

import test_p26.RacingCar;
import test_p26.Car;

public class test_p26 {
	public static void main(String[] srgs) {
		Car[] cars;
		cars = new Car[2];
		cars[0]= new Car();
		cars[1]= new RacingCar();
		
		for(int i=0;i<cars.length;i++)
		{
			Class cl =cars[i].getClass();
			System.out.println("第"+(+1)+"個物件的類別是"+cl);
		}
		
	}
}
class Car{
	protected int num;
	protected double gas;
	
	public Car() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}	
}
class RacingCar extends Car{
	
	public RacingCar() {

		System.out.println("生產了賽車");
	}	
}
