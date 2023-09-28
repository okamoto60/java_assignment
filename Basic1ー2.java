/*
2. 数値型の配列を2つ（変数名：arr1, arr2）用意してください。
	arr1の変数の各要素に「0 ～ 9」を代入し、初期化してください。	
	arr1に代入した要素を取り出し、arr2に反転した結果「9 ～ 0」を代入してください。
*/
public class Basic1ー2 {
	public static void main(String[] args) {
		
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		
		// arr1に0~9を代入→表示
		System.out.println("【arr1】");
		for(int i=0; i<=9; i++) {
			arr1[i] = i;
			System.out.println(arr1[i]);
		}
		
		// arr2にarr1を反転して代入
		int y = 9;
		for(int reverse:arr1 ) {
			arr2[y] =reverse;
			y--;
		}
		
		// arr2を表示
		System.out.println("【arr2】");
		for(int reverse:arr2) {
			System.out.println(reverse);
		}
	}
}
 