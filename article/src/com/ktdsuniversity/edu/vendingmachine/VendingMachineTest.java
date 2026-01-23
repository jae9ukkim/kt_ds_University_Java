package com.ktdsuniversity.edu.vendingmachine;

import com.ktdsuniversity.edu.vendingmachine.item.Item;
import com.ktdsuniversity.edu.vendingmachine.machine.VendingMachine;

public class VendingMachineTest {

	public static void main(String[] args) {
		Item bacas = new Item("박카스", 900, 15);
		Item monster = new Item("몬스터", 1500, 20);
		Item hotsix = new Item("핫식스", 1300, 10);
		Item milkiss = new Item("밀키스", 1400, 5);
		
		VendingMachine vm = new VendingMachine(bacas, monster, hotsix, milkiss);
		
		vm.printStocks();
		vm.order(0,10);
		vm.order(1,15);
		vm.order(2,5);
		vm.order(3,4);
		vm.order(3,1);
		vm.order(3,1);
		vm.order(-1,1);
		vm.order(4,1);
		vm.store(0, 77);
		vm.store(1, 23);
		vm.store(2, 95);
		vm.store(3, 42);
		vm.store(-1, 2);
		vm.store(4, 5);
		vm.printStocks();
	}
}
