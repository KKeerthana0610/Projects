package assignment1;

public class Sound {

	public static void main(String[] args) {
		Animal a= new Animal();
		a.makeSound();
		System.out.println("Dog :");
		Dog d=new Dog();
		d.makeSound();
		System.out.println("Cat :");
		Cat c=new Cat();
		c.makeSound();

	}

}
