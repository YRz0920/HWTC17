package com.oaec.dvd.model;

public class User {
	private int id;//
	private String name;
	private String Upass;
	private int type;

	public User(int id, String name, String upass, int type) {
		super();
		this.id = id;
		this.name = name;
		Upass = upass;
		this.type = type;
	}

	public User(String name, String upass, int type) {
		// super();

		this.name = name;
		Upass = upass;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUpass() {
		return Upass;
	}

	public void setUpass(String upass) {
		Upass = upass;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
