package com.pushkal.transactionTypes;

import com.pushkal.transaction.Transaction;
import com.pushkal.transactionAdapter.CardTransactionAdapter;

public class CardTransaction implements Transaction {
	
	String cardType;
	Transaction cardTransAdapter;
	
	public CardTransaction(String cardType) {
		// TODO Auto-generated constructor stub
		this.cardType = cardType;
	}
	
	public void transact() {
		// TODO Auto-generated method stub
		if(cardType.equals("MasterCard")) {
			System.out.println("This transaction is done by Mastercard payment card");
		}
		
		else if(cardType.equals("RuPay")) {
			cardTransAdapter = new CardTransactionAdapter(cardType);
			cardTransAdapter.transact();
		}
	}

}
