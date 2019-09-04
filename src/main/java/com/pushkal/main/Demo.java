package com.pushkal.main;

import com.pushkal.transaction.Transaction;
import com.pushkal.transactionTypes.CardTransaction;

public class Demo {
	public static void main(String[] args) {
		Transaction demo = new CardTransaction("RuPay");
		demo.transact();
	}
}
