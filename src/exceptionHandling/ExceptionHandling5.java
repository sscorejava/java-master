package exceptionHandling;

public class ExceptionHandling5 {

	int count = 0;

	void A() throws Exception {
		try {
			count++;

			try {
				count++;

				try {
					count++;
					throw new Exception();

				}

				catch (Exception ex) {
					count++;
					throw new Exception();
				}
			}

			catch (Exception ex) {
				count++;
			}
		}

		catch (Exception ex) {
			count++;
		}

	}

	void display() {
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		ExceptionHandling5 obj = new ExceptionHandling5();
		obj.A();
		obj.display();
	}

}
