package com.hrish.demorest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class game {
	
	private String name;
	@Override
	public String toString() {
		return "game [name=" + name + ", score=" + score + ", id=" + id + "]";
	}
	private int score;
	private int id;
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	

}
