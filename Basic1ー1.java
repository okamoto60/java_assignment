/*
 1.文字列型の変数を2つ（変数名：str1, str2）用意してください。
それぞれの変数に「aaa」「bbb」を代入してください。
代入した値を入れ替えてください。 
*/
public class Basic1ー1 {
	public static void main(String[] args) {
		
		// 値を代入
		String str1 = "aaa";
		String str2 = "bbb";
		System.out.println(str1);
		System.out.println(str2);
		
		// 値を入れ替える
		String tentative =str1;
		str1 = str2;
		str2 = tentative;
		
		System.out.println(str1);
		System.out.println(str2);
	
	}
	
	
}
