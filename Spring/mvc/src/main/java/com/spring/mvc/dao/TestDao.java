package com.spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
public class TestDao {
	
	@Getter
	@Setter
	private String name;
	@Setter
	private String place;
	@Setter
	private String thing;
	@Autowired
	private Game game;
	
	public void show() {
		System.out.println("in TestDao class method");
		game.printGame();
	}
	

}
