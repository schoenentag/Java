package generics;
import java.util.ArrayList;

class Juice {
	String name;
	Juice(String name) { this.name = name + "Juice"; }
	public String toString() { return name; }
}
class Juicer{
	static Juice makeJuice(FruitBox2< ? extends Fruit2> box) { // 와일드 카드 : Fruit2와 그 자손들 Apple, Grape 가능
		String tmp = " ";
		for (Fruit2 f: box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}

public class GenericsPractice2 {

	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>(); // 타입이 일치해야함
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		
//		FruitBox2<? extends Fruit2> appleBox2 = new FruitBox2<Apple2>();
//		와일드카드를 쓰면 일치하지 않아도 됨. < ? extends Fruit2 > : Fruit2와 그 자손들 Apple, Grape 가능
//		appleBox2 = new FruitBox2<Fruit2>();
//		appleBox2 = new FruitBox2<Apple2>();
//		appleBox2 = new FruitBox2<Grape2>();
//		와일드카드를 쓰면  인해 생성가능해짐 
		
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}
}

class FruitBox2<T extends Fruit2> extends Box2<T>{}
class Box2<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) {return list.get(i);}
	ArrayList<T> getList() {return list;}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}
