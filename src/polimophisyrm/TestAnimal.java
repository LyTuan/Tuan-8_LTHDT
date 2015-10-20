package polimophisyrm;

public class TestAnimal {
	public static void main(String []args){
		Animal animal = new Cow();
		System.out.println(animal.toString());
		animal = new Cat();
		System.out.println(animal.toString());
		Cow c = new Cow();
		Pig p = new Pig();
		System.out.println(p.talk(c));
	}
}
