/*
 1. Animalという名前の親クラスを作成し、sound()というメソッドを定義してください。sound()メソッドは、動物の鳴き声
を出力するように実装してください。
Dog、Cat、Lionという名前の子クラスを作成し、それぞれAnimalクラスを継承してください。また、各クラスには必要な
変数とコンストラクタを定義してください。
main関数を持つクラスを作成し、Dog、Cat、Lionのオブジェクトを作成して、各オブジェクトのsound()メソッドを呼び出
すプログラムを作成してください。
 */
public class Inheritance {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Lion lion = new Lion();
		
		dog.sound();
		cat.sound();
		lion.sound();
		
	}
}

class Animal{
	
	public String voice;
	public  String pet;
	
	public void sound() {
		System.out.println(pet + "の鳴き声:" + voice);
	}
}

class Dog extends Animal{
	Dog(){
		pet = "犬";
		voice = "ワン";
	}
}

class Cat extends Animal{
	Cat(){
		pet = "猫";
		voice = "ニャー";
	}
}

class Lion extends Animal{
	Lion(){
		pet = "ライオン";
		voice = "ガオー";
	}
}