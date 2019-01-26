package designPatterns.creationalDesignPatterns.abstractFactoryPattern;

class HomeLoan extends Loan {

	@Override
	void getInterestRate(double rate) {
		this.rate = rate;

	}

}
