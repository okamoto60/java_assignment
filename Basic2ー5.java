/*
 5. X軸（int） 、Y軸（int）の座標を保持するPointクラスを作成してください。
2点の座標の距離を求める関数を作成し、main関数を持つクラスで計算結果を表示してください。
2点の座標を計算する計算式： Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))
 */
public class Basic2ー5 {
	public static void main(String[] args) {
		Point point = new Point();
		point.CIE(10, 15, 8, 10);
	}
}

class Point{
	public void CIE(int x1, int x2, int y1, int y2) {
		System.out.println(Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
	}
}