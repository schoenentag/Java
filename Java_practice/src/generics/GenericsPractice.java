package generics;

import java.util.ArrayList;

public class GenericsPractice {

	public static void main(String[] args) {
		
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		// FruitBox<Grape> grapeBox = new FruitBox<Apple>(); //ERROR! 타입 불일치!
		// FruitBox<Toy> toyBox = new FruitBox<Toy>(); //ERROR!
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		//appleBox.add(new Grape()); // ERROR! Grape는 Apple의 자손이 아님
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox-"+fruitBox);
		System.out.println("fruitBox-"+appleBox);
		System.out.println("fruitBox-"+grapeBox);
	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {} 
class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
	
	}

