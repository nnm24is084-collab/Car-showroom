package car;

public class Showroom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car("Toyota","corolla",15000,18.5);
		Car c2=new Car("Honda","civic",20000,16.0,"john");
		Car c3=new Car("hyundai","i20",12000,20.0);
		System.out.println("c1 details");
		c1.Displaydetails();
		System.out.println("c2 details");
		c2.Displaydetails();
		System.out.println("c3 details");
		c3.Displaydetails();
		c1.setOwnerName("Neha");
		c1.updateprice(1600);
		System.out.println("c1 updated:");
		c1.Displaydetails();
		Car.showShowroomName();
		Car.showTotalCars();
	}
}


