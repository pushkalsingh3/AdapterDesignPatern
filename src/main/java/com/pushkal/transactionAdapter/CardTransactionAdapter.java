package com.pushkal.transactionAdapter;

import com.pushkal.transaction.IndianPaymentCardTransaction;
import com.pushkal.transaction.Transaction;
import com.pushkal.transactionTypes.RuPayCardTransaction;

public class CardTransactionAdapter implements Transaction {

	IndianPaymentCardTransaction ruPay;
	
	public CardTransactionAdapter(String cardType) {
		// TODO Auto-generated constructor stub
		if (cardType.equals("RuPay")) {
			ruPay = new RuPayCardTransaction(cardType);
		}
	}
	
	public void transact() {
		// TODO Auto-generated method stub
		ruPay.transact();

	}

}
