package com.phint2.pattern.behavioral.cor.leaverequest;

public class DeliveryManage extends Approver {

	@Override
	protected String getTitle() {
		return "Delivery Manager";
	}

	@Override
	protected boolean canApprove(int numberOfDays) {
		return numberOfDays <= ApproverPermission.DeliveryManage.getDays();
	}
}
