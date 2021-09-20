package app;

public class Shapename {

	public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		shape[0] = new Circle(5);
		shape[1] = new Circle(7);
		shape[2] = new Rect(9, 5);
		System.out.println("shape[0]'s area : " + shape[0].area());
		System.out.println("shape[1]'s area : " + shape[1].area());
		System.out.println("shape[2]'s area : " + shape[2].area());
//		문제1) circumference 출력
//		문제2) shape[1] 도형의 반지름 3 값으로 변경해서 결과 출력하시오
//		Circle c = shape[1];
//		c.setRadius(3);
		Circle c = (Circle)shape[1];
		c.setRadius(3);
		System.out.println("shape[1]'s area : " + c.area());
		}

}
