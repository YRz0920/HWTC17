package com.oaec.dvd.model;

public class Record {
	private int id;// --��¼���
	private int uid;// --��DVD�˵ı��
	private int did;// --�����DVD�ı��
	private long lendTime;// �����ʱ��
	private long returnTime;// �黹ʱ��

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
