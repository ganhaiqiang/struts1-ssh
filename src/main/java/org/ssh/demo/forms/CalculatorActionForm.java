package org.ssh.demo.forms;

import org.apache.struts.action.ActionForm;

public class CalculatorActionForm extends ActionForm {
	private static final long serialVersionUID = 1L;

	private double param1;
	private double param2;
	private String operator;

	public double getParam1() {
		return param1;
	}

	public void setParam1(double param1) {
		this.param1 = param1;
	}

	public double getParam2() {
		return param2;
	}

	public void setParam2(double param2) {
		this.param2 = param2;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
}
