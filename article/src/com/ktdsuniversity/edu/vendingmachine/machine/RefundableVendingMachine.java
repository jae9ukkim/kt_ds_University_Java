package com.ktdsuniversity.edu.vendingmachine.machine;

import com.ktdsuniversity.edu.vendingmachine.item.Item;

public class RefundableVendingMachine extends VendingMachine {

	public RefundableVendingMachine(Item bacas, Item monster, Item hotsix, Item milkiss) {
		super(bacas, monster, hotsix, milkiss);
	}

	/**
	 * 사용자가 돈을 넣은 후 존재하지 않는 음료를 골랐을 때, 사용자에게 돈을 돌려준다. DrinkVendingMachine의 멤버변수와
	 * order 기능의 수정이 필요.
	 */
	public void refund() {
		System.out.println(super.getPayment() + "원 환불되었습니다.");
		System.out.println();
		super.setPayment(0);
	}

}
