package com.pushkal.transactionTypes;

import com.pushkal.transaction.IndianPaymentCardTransaction;

public class RuPayCardTransaction implements IndianPaymentCardTransaction {

	String cardType;
	
	public RuPayCardTransaction(String cardType) {
		// TODO Auto-generated constructor stub
		this.cardType = cardType;
	}
	
	public void transact() {
		// TODO Auto-generated method stub
		System.out.println("This transaction is done by using RuPay payment card");
	}

}
