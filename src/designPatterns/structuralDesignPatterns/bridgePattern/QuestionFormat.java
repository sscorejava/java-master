package designPatterns.structuralDesignPatterns.bridgePattern;

public class QuestionFormat extends QuestionManager {

	public QuestionFormat(String catalog) {
		super(catalog);

	}

	@Override
	public void displayAll() {
		System.out.println("\n---------------------------------------------------------");
		super.displayAll();
		System.out.println("-----------------------------------------------------------");
	}

}
