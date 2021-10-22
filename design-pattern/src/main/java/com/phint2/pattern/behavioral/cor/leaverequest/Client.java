package com.phint2.pattern.behavioral.cor.leaverequest;

public class Client {

	public static void main(String[] args) {

		LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(8));
		System.out.println("---");
		LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(2));
		System.out.println("---");
		LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(5));
	}
}
