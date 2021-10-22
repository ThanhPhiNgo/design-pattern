package com.phint2.pattern.behavioral.cor.leaverequest;

public abstract class Approver {

	protected Approver nextApprover;

	public void approveLeave(LeaveRequest request) {
		System.out.println("Checking permission for " + this.getClass().getSimpleName());

		if (this.canApprove(request.getDays())) {
			this.doApproving(request);
		} else if (nextApprover != null) {
			nextApprover.approveLeave(request);
		}
	}

	public void setNext(Approver approver) {
		this.nextApprover = approver;
	}

	protected void doApproving(LeaveRequest request) {
		System.out.println("Leave request approved for " + request.getDays() + " days by " + getTitle());
	}

	protected abstract String getTitle();

	protected abstract boolean canApprove(int numberOfDays);
}
