package com.poly.controller;

import com.poly.model.vo.Character;

public class GameController {
	
	private Character c;
	
	
	
	public GameController() {}
	
	
	
	public GameController(Character c) {
		this.c = c;
	}

	


	public void attck() {
		c.attack();
	}
	
	public void defense() {
		c.defence();
	}


	public void printCharacter() {
		System.out.println(c);
	}

}	
