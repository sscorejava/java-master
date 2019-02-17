package practicePrograms.test;

public class ShutDownHooksDemo {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			final int final_i = i;
			try {
				Runtime.getRuntime().addShutdownHook(new Thread() {
					public void run() {
						if (final_i == 4) {
							System.out.println("Inside Try Block.Exiting without executing Finally block.");
							System.exit(0);
						}
					}
				});
			} finally {
				System.out.println("Inside Finally Block.");
			}

		}

	}

}
