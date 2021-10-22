package com.phint2.pattern.behavioral.cor.leaverequest;

public enum ApproverPermission {

	Supervisor(3),
	DeliveryManage(5),
	Director(Integer.MAX_VALUE);

	private int days;

	private ApproverPermission(int days) {
		this.days = days;
	}

	public int getDays() {
		return this.days;
	}
}
