package com.phint2.pattern.behavioral.cor.leaverequest;

public class Supervisor extends Approver {

	@Override
	protected String getTitle() {
		return "Supervisor";
	}

	@Override
	protected boolean canApprove(int numberOfDays) {
		return numberOfDays <= ApproverPermission.Supervisor.getDays();
	}
}
