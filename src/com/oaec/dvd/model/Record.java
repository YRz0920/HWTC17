package com.oaec.dvd.model;

public class Record {
	private int id;// --记录编号
	private int uid;// --借DVD人的编号
	private int did;// --被借的DVD的编号
	private long lendTime;// 被借的时间
	private long returnTime;// 归还时间

	public Record(int uid, int did, long lendTime, long returnTime) {
		super();
		this.uid = uid;
		this.did = did;
		this.lendTime = lendTime;
		this.returnTime = returnTime;
	}

	public Record(int id, int uid, int did, long lendTime, long returnTime) {
		super();
		this.id = id;
		this.uid = uid;
		this.did = did;
		this.lendTime = lendTime;
		this.returnTime = returnTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public long getLendTime() {
		return lendTime;
	}

	public void setLendTime(long lendTime) {
		this.lendTime = lendTime;
	}

	public long getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(long returnTime) {
		this.returnTime = returnTime;
	}

}
