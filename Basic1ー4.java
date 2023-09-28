/*
 4. 1から100までの要素を持つ配列を作成し偶数だけ表示してください。
 */
public class Basic1ー4 {
	public static void main(String[] args) {
		// 配列を作成
		int[] num = new int[100];
		
		// 値を代入
		for(int i = 0; i<=99; i++) {
			num[i] = i + 1;
		}
		
		//　偶数のみ表示
		for(int number:num) {
			if(number %2 ==0) {
				System.out.println(number);
			}
		}
	}
}
