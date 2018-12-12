package com.hrish.demorest;

import java.util.ArrayList;
import java.util.List;

public class Repository 
{
	public List<game> game;
	public Repository()
	{
		game = new ArrayList<>();
		game g1 = new game();
		g1.setid(1);
		g1.setName("Hrishabh");
		g1.setScore(22);
		game g2 = new game();
		g2.setid(2);
		g2.setName("abdul");
		g2.setScore(20);
		game.add(g1);
		game.add(g2);
		
	}
	
	public game getgame(int id) {
		for(game a : game) {
			if(a.getid()==id) {
				return a;
				
			}
		}
		return null;
	}
	public List<game> getGame() {
		// TODO Auto-generated method stub
		return game;
	}

	public void create(game g1) {
		game.add(g1);// TODO Auto-generated method stub
		
	}

	
		
	}