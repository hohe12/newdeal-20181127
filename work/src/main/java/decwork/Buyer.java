package decwork;

import java.util.Scanner;

class Buyer {
	static int buyerMoney;
	static int bonuspoint;

	public Buyer() {
		buyerMoney = 1000;
		bonuspoint = 0;
	}

	public void buy(int price, int point) {
		buyerMoney = buyerMoney - price;
		bonuspoint = bonuspoint + point;
	}
	public boolean checkmoney(int price) {
		if(buyerMoney>price) {
			return true;
		}else {
			System.out.println("잔액이 부족합니다.");
			return false;
		}
		
	}
	public void kttvbuy(int price, int point) {
		if(checkmoney(price)) {
		buy(price, point);
		}
	}

	//
	public void audiotbuy(int price, int point) {
		if(checkmoney(price)) {
			buy(price, point);
			}
		}

	public void notebookbuy(int price, int point) {
		if(checkmoney(price)) {
			buy(price, point);
			}
			}

	public static void main(String[] args) {
		KtTv kttv = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		Scanner sc = new Scanner(System.in);
		Buyer buyer = new Buyer();
		Cart cart = new Cart();
		for (int i = 0;; i++) {
			System.out.println("1. 내 보유 금액확인 2. 내 포인트 확인 3. kttv 카트에담기 4.오디오 카트에 담기 5. 노트북 카트에 담기 6. 구매하기 ");
			System.out.println("7. 카트초기화하기 8. 그만구매하기 >>");

			int num = Integer.parseInt(sc.nextLine());

			if (num == 1) {
				System.out.print("현재 보유 금액 : ");
				System.out.println(buyerMoney);
			} else if (num == 2) {
				System.out.print("현재 보유 포인트 : ");
				System.out.println(bonuspoint);
			} else if (num == 3) {
				cart.buytv(kttv);
				cart.cart[i]="kttv";
				System.out.println("카트목록 >>");
				for(int j=0;j<=i;j++) {
					System.out.println(cart.cart[j]+ ", ");
				}
			} else if (num == 4) {
				cart.buyaudio(audio);
				cart.cart[i]="audio";
				System.out.println("카트목록 >>");
				for(int j=0;j<=i;j++) {
					System.out.println(cart.cart[j]+ ", ");
				}
			} else if (num == 5) {
				cart.buynoteboock(notebook);
				cart.cart[i]="notebook";
				System.out.println("카트목록 >>");
				for(int j=0;j<=i;j++) {
					System.out.println(cart.cart[j]+ ", ");
				}
			} else if (num == 6) {
				if(cart.totalprice>buyerMoney) {
					System.out.println("잔액이 부족합니다.");
				}else {
				cart.buy();
				System.out.println("잔액 : "+buyerMoney);
				System.out.println("잔여 포인트 : "+bonuspoint);
				}
			} else if(num == 7){
				cart = new Cart();
				continue;// 아래처럼 가능
			}else if(num == 8){
				break;
			}else {
				continue;
			}
			// buyer.구매함수(kttv);
			// buyer.구매함수(audio);
		}
	}

}
