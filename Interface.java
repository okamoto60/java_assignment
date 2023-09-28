/*
 1. Shape（図形）という名前のインターフェースを作成し、area()とperimeter()という2つのメソッドを定義してください。
		・area()メソッド・・・面積を返す。
		・perimeter()メソッド・・・周囲長を返す。
Rectangle（長方形）、Circle（円）、Triangle（正三角形）という名前の3つのクラスを作成し、それぞれShapeインター
フェースを実装してください。また、各クラスには必要な変数とコンストラクタを定義してください。
main関数を持つクラスを作成し、Rectangle、Circle、Triangleのオブジェクトを作成して、各オブジェクトの面積と周囲長
を出力するプログラムを作成してください。
 */
public class Interface {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Circle cir = new Circle();
		Triangle tri = new Triangle();
		
		System.out.println("【面積】");
		rec.area();
		cir.area();
		tri.area();
		
		System.out.println("【周囲長】");
		rec.perimeter();
		cir.perimeter();
		tri.perimeter();
	}
}

interface Shape{
	void area();
	void perimeter();
}

class Rectangle implements Shape{
	int x = 10;
	int y = 15;
	public void area() {
		System.out.println("長方形:"+ x + "×" + y + "=" + (x*y));
	}
	public void perimeter() {
		System.out.println("長方形:("+ x + "+" + y + ")×2=" + ((x+y)*2));
	}
}

class Circle implements Shape{
	int x = 5;
	
	public void area() {
		System.out.println("円:"+ x + "×" + x + "×3.14=" + (x*x*3.14));
	}
	public void perimeter() {
		System.out.println("円:"+ x*2 + "×3.14=" + ((x*2)*3.14));
	}
}

class Triangle implements Shape{
	
	int x = 10;
	int y = 10;
	
	public void area() {
		System.out.println("正三角形:"+ x + "×" + y + "×0.43=" + ((x*y)*0.43));
	}
	public void perimeter() {
		System.out.println("正三角形:"+ x + "×3=" +  (x*3));
	}
}


