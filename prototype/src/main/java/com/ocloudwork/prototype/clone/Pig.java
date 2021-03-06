package com.ocloudwork.prototype.clone;

import java.util.Date;

public class Pig implements Cloneable {
	private String name;
	private Date birthday;

	public Pig(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//浅克隆
		//return super.clone();
		Pig pig=(Pig) super.clone();
		pig.birthday=(Date) this.birthday.clone();
		return pig;
	}

	@Override
	public String toString() {
		return "Pig [name=" + name + ", birthday=" + birthday + "]"+super.toString();
	}

}
