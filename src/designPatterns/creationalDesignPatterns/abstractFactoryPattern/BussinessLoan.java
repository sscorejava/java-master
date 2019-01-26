package designPatterns.creationalDesignPatterns.abstractFactoryPattern;

public class BussinessLoan extends Loan {

	@Override
	void getInterestRate(double rate) {
		this.rate = rate;

	}

}
