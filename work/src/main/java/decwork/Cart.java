package decwork;

public class Cart {
	String [] cart;
	int totalprice;
	int totalbonus;
	public Cart() {
		cart = new String[10];
		totalprice = 0;
		totalbonus = 0;
	}
	
	public void buytv(Product pro) {
		totalprice += pro.price;
		totalbonus += pro.bonuspoint;
	}

	public void buyaudio(Product pro) {
		totalprice += pro.price;
		totalbonus += pro.bonuspoint;
	}

	public void buynoteboock(Product pro) {
		totalprice += pro.price;
		totalbonus += pro.bonuspoint;
	}
	public void buy() {
		int  a = Buyer.buyerMoney - totalprice;
		int  b = Buyer.bonuspoint - totalbonus;
		
	}
}
