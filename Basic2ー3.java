/*
3. main関数を持つクラスを1つ、足し算、引き算、掛け算、割り算の計算をする関数を持つクラ
スをそれぞれ作成してください。関数は静的メソッドとして作成してください。
main関数を持つクラスに、作成した足し算、引き算、掛け算、割り算の静的メソッドを使用し、
計算を行ってください。
*/
public class Basic2ー3 {
	public static void main(String[] args) {
		int x = 6;
		int y = 2;
		
		staticCALCULATION.staticSUM(x,y);
		staticCALCULATION.staticSUBTRACTION(x,y);
		staticCALCULATION.staticMULTIPLICATION(x,y);
		staticCALCULATION.staticDICISION(x,y);
		
	}
	

}

class staticCALCULATION{
	
	static void staticSUM(int x , int y) {
		System.out.println("足し算:" + x + "+" + y + "=" + (x+y));
	}
	
	static void staticSUBTRACTION(int x , int y) {
		System.out.println("引き算:" + x + "-" + y + "=" + (x-y));
	}
	
	static void staticMULTIPLICATION(int x , int y) {
		System.out.println("掛け算:" + x + "×" + y + "=" + (x*y));
	}
	
	static void staticDICISION(int x , int y) {
		System.out.println("割り算:" + x + "÷" + y + "=" + (x/y));
	}
}
