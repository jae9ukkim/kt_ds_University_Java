package com.ktdsuniversity.edu.market;

import com.ktdsuniversity.edu.market.buyer.MyBuyer;
import com.ktdsuniversity.edu.market.seller.MySeller;

public class MyMarket {
	
	public static void main(String[] args) {
		
		MyBuyer buyer = new MyBuyer(5000, 3000);
		MySeller seller = new MySeller(30);
		
		// 구매자가 판매자에게 제품을 5개 구매한다.
		// 구매자가 상품을 구매하려면 판매자가 판매를 먼저 해야한다.
		int stock = seller.getStock();
		int price = seller.getITEM_PRICE();
		int weight = seller.getITEM_WEIGHT();
		
		if(stock >=5 
				&& buyer.getCash() >= price * 5 
				&& (buyer.getMaxWeight() - buyer.getCartWeight()) > weight * 5 ) {
			seller.sell(5);	
			buyer.buy(price * 5, weight * 5, 5);
		}
		
	}

}
