/*
 1. 数値（int）の引数を2つ受け取り、足し算を行う関数を作成してください。
	作成した関数をmain関数で使用し、結果を標準出力で表示してください。
	※足し算の関数に渡す引数の値は、数値（int）であれば何でも良い。
 */

/*
2. 上記で作成したクラスに、足し算の関数と同様2つの引数を受け取り、
	引き算、掛け算、割り算を行う関数を作成してください。
	作成した関数をmain関数で使用し、結果を標準出力で表示してください。
	※各関数に渡す引数の値は、数値（int）であれば何でも良い。
 */

public class Basic2ー1 {
	public static void main(String[] args) {
		
		int i = 6;
		int y = 3;
		// 2-1:足し算
		System.out.println("足し算:" + i + "+" + y + "=" + addition(i,y));
		
		//2-2引き算,掛け算,割り算
		System.out.println("引き算:" + i + "-" + y + "=" + subtraction(i,y));
		System.out.println("掛け算:" + i + "×" + y + "=" + multiplication(i,y));
		System.out.println("割り算:" + i + "÷" + y + "=" + division(i,y));
		}
	
	// 2-1:足し算
	public static  Integer addition(Integer i, Integer  y) {
		return i + y;
	}
	
	// 2-2引き算
	public static Integer subtraction(Integer i, Integer y) {
		return i-y;
	}
	
	// 2-2掛け算
	public static Integer multiplication(Integer i, Integer y) {
		return i*y;
	}
	
	// 2-2割り算
	public static Integer division(Integer i, Integer y) {
		return i/y;
	}
}