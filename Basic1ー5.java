/*
 5. キーに「1から5」、値に「りんご、いちご、みかん、バナナ、メロン」を順にセットした
HashMapを作成し、キーと値を一つずつ表示してください。
 */

import java.util.HashMap;

public class Basic1ー5 {
	public static void main(String[] args) {
		HashMap<Integer,String> fruits = new HashMap<>();
		String[] fruit = {"りんご","いちご","みかん","バナナ","メロン"};
		
		// 値の代入
		for(int i = 0; i<=4; i++) {
			fruits.put(i+1,fruit[i]);
		}
		
		// 表示
		for(int i = 1;i<=5; i++) {
			System.out.println("キー:" + i + "=" +fruits.get(i));
		}
		
	}
}
