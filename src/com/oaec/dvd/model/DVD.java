package com.oaec.dvd.model;

public class DVD {
	private int id;//--DVD的编号
	private String name;//--DVD的名字
	private String dcount;//DVD 被借出的次数
	private int status;//DVD的状态

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

	public String getDcount() {
		return dcount;
	}

	public void setDcount(String dcount) {
		this.dcount = dcount;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public DVD(int id, String name, String dcount, int status) {
		
		this.id = id;
		this.name = name;
		this.dcount = dcount;
		this.status = status;
	}
	public DVD(){
		
	}

	public DVD(String name, String dcount, int status) {
		//super();
		this.name = name;
		this.dcount = dcount;
		this.status = status;
	}
	@Override
	public boolean equals(Object obj) {
		 boolean result=false;
		if(obj==null||obj.getClass()!=this.getClass()){
			return true;
		}
			DVD dd=(DVD)obj;
			if(dd.getId()==this.getId()){
				System.out.println("ID重复");
				result=false;
				}else{
				result=true;
				}
			return result;
			
	}
	@Override
	public String toString() {
		return "DVD [id=" + id + ", name=" + name + ", dcount=" + dcount + ", status=" + status + "]";
	}
}
