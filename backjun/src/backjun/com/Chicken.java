package backjun.com;

public class Chicken {
	private int cupon;	//��������
	private int freeChicken;	//��ġŲ�� �ʿ��� ����
	private int money;	//���߿� �ִ� �� 
	private int priceChicken; //ġŲ��
	private int total;
	
	public Chicken() {}
	
	public Chicken(int priceChicken, int money, int freeChicken, int cupon, int total) {

		this.cupon = cupon;
		this.freeChicken = freeChicken;
		this.money = money;
		this.priceChicken = priceChicken;
		this.total = total;
	}



	@Override
	public String toString() {
		return "Chicken [cupon=" + cupon + ", freeChicken=" + freeChicken + ", money=" + money + ", priceChicken="
				+ priceChicken + "]";
	}

	public int getCupon() {
		return cupon;
	}

	public void setCupon(int cupon) {
		this.cupon = cupon;
	}

	public int getFreeChicken() {
		return freeChicken;
	}

	public void setFreeChicken(int freeChicken) {
		this.freeChicken = freeChicken;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPriceChicken() {
		return priceChicken;
	}

	public void setPriceChicken(int priceChicken) {
		this.priceChicken = priceChicken;
	}
	public int totalChic(){
		total += money/priceChicken;
		total += (cupon * total)/freeChicken;
		
		return total;
	}
	
	
}
