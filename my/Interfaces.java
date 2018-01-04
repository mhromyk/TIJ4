package my;

interface Speakable{
	void speak();
}

interface SpeakableFactory{
	Speakable getSpeakable();
}

class Incubator{
	public Speakable getSpeakable(){
		return new Speakable();
	}
	
}

class Animal{
	String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}

class Dog extends Animal implements Speakable{
	public void speak(){
		System.out.println("Wof..Wof");
	}
	
}


class Cat extends Animal implements Speakable{
	public void speak(){
		System.out.println("Meee-ooowww...");
	}
	

}	

