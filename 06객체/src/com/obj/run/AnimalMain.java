package com.obj.run;
import com.obj.model.vo.Animal;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal dog = new Animal("개","뽀삐",5,50,"우리집");
		Animal cat = new Animal("고양이","야옹이",5,40,"짬통");
		Animal turtle = new Animal("거북이","꼬북이",1.2,5,"어항속");
		Animal kameleon = new Animal();
		
		System.out.print(dog.kindof+" "+dog.name+" "+dog.weight+"kg "+dog.len+"cm "+dog.address+"\n");
		System.out.print(cat.kindof+" "+cat.name+" "+cat.weight+"kg "+cat.len+"cm "+cat.address+"\n");
		System.out.print(turtle.kindof+" "+turtle.name+" "+turtle.weight+"kg "+turtle.len+"cm "+turtle.address+"\n");
	}

}
