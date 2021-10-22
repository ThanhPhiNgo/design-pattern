package com.phint2.pattern.behavioral.cor.leaverequest;

public class Director extends Approver {
	@Override
	protected String getTitle() {
		return "Director";
	}

	@Override
	protected boolean canApprove(int numberOfDays) {
		return numberOfDays > ApproverPermission.DeliveryManage.getDays();
	}
}
