package app;

public class ClassEx2 {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("Wheel : " + car.wheel);
		System.out.println("speed : " +car.speed);
		System.out.println("name : " +car.name);
		System.out.println("�� �޸���");
		car.speedUp();
		car.display();
		car.speedUp();
		car.speedUp();
		car.display();
		Car car2 = new Car("����");
		System.out.println("Wheel : " + car2.wheel);
		System.out.println("speed : " +car2.speed);
		System.out.println("name : " +car2.name);
		car.speedUp();
		car.display();
	}

}
class Car{
	int wheel = 4;
	int speed;
	String name;
	public Car() {
		wheel = 4;
		speed = 0;
		name = "Ƽ��";
	}
	public Car(String name) {
		wheel = 4;
		speed = 0;
		this.name = name;
	}
	public void speedUp() {
		speed += 100;
	}
	public void display() {
		System.out.println("���̸� : " + name +", ����ӵ� : " + speed + ", ������ : " + wheel);
	}
	public void display(String name, int speed, int wheel) {
		System.out.println("���̸� : "
				+ name
				+ ", �ִ� �ӵ� : " + this.speed
				+ ", ������ : "
				+ wheel);
		
	}
}
