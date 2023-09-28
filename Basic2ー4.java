/*
  4. main関数を持つクラスを1つ、足し算、引き算、掛け算、割り算の計算をする関数を持つクラスをそれぞれ作
成してください。関数は動的メソッドとして作成してください。
また、関数は引数を持たず、クラスのインスタンス変数を使用し計算を行ってください。
main関数を持つクラスに、作成した足し算、引き算、掛け算、割り算の動的メソッドを使用し、計算を行って
ください。
※各クラスのインスタンス生成時に渡す引数の値は、数値（int）であれば何でも良い。
 */
public class Basic2ー4 {
	public static void main(String[] args) {
		CALCULATION cal = new CALCULATION();
		int x = 6;
		int y = 6;
		
		cal.SUM(x, y);
		cal.SUBTRACTION(x, y);
		cal.MULTIPLICATION(x, y);
		cal.DICISION(x, y);
		
	}
}

class CALCULATION{
	public void SUM(int x , int y) {
		System.out.println("足し算:" + x + "+" + y + "=" + (x+y));
	}
	
	public void SUBTRACTION(int x , int y) {	
		System.out.println("引き算:" + x + "-" + y + "=" + (x-y));
	}
	
	public void MULTIPLICATION(int x , int y) {
		System.out.println("掛け算:" + x + "×" + y + "=" + (x*y));
	}
	
	public void DICISION(int x , int y) {
		System.out.println("割り算:" + x + "÷" + y + "=" + (x/y));
	}
}