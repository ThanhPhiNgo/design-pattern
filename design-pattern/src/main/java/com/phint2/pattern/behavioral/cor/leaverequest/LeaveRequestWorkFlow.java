package com.phint2.pattern.behavioral.cor.leaverequest;

public class LeaveRequestWorkFlow {

	public static Approver getApprover() {
		Approver supervisor = new Supervisor();
		Approver manager = new DeliveryManage();
		Approver director = new Director();

		supervisor.setNext(manager);
		manager.setNext(director);
		return supervisor;
	}
}
