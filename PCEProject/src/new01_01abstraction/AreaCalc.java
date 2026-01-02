package new01_01abstraction;

import java.util.Scanner;

public class AreaCalc {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		Area(new Circle());
		Area(new Triangle());
		Area(new Square());
	}
	static void Area(Shapes s)
	{
		s.findArea();
		s.dispArea();
	}
}

abstract class Shapes
{
	double area;
	abstract void findArea();
	abstract void dispArea();
}

class Circle extends Shapes
{
	void findArea() {
		System.out.println("Enter Radius");
		Scanner scan = AreaCalc.scan;
		float r = scan.nextFloat();
		area = 3.14f * r * r;
	}
	void dispArea() {
		System.out.println("Area of Circle"+area);
		System.out.println();
		
	}
}


class Triangle extends Shapes
{
	void findArea() {
		System.out.println("Enter Length & Breadth");
		Scanner scan = AreaCalc.scan;
		float l = scan.nextFloat();
		float b =scan.nextFloat();
		area = 0.5f*l*b;
	}
	void dispArea() {
		System.out.println("Area of Traingle"+area);
		System.out.println();
		
	}
}


class Square extends Shapes
{
	void findArea() {
		System.out.println("Enter side of square");
		Scanner scan = AreaCalc.scan;
		float side = scan.nextFloat();
		area = side*side;
	}
	void dispArea() {
		System.out.println("Area of Square"+area);	
		System.out.println();
	}
}
