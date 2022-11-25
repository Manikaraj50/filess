package org.bank;

public class BankRules extends Banking {
	@Override
	public void fixed(String amount) {
		// TODO Auto-generated method stub
		System.out.println("the fixed amount is "+amount);
		
	}
	public static void main(String[] args) {
		BankRules b=new BankRules();
		b.fixed("120000");
		b.savings();
	}

}
