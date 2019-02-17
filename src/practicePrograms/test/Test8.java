package practicePrograms.test;

/**
 * 
 * From the program, it looks like “println” inside finally block will be executed 5 times. 
 * But if the program is executed, the user will find that finally block is called only 4 times. 
 * In the fifth iteration, exit function is called and finally never gets called the fifth time. 
 * The reason is- System.exit halts execution of all the running threads including the current one. 
 * Even finally block does not get executed after try when exit is executed.
 *
 * When System.exit is called, JVM performs two cleanup tasks before shut down:
 *
 * First, it executes all the shutdown hooks which have been registered with Runtime.addShutdownHook. 
 * This is very useful because it releases the resources external to JVM.
 *
 * Second is related to Finalizers. Either System.runFinalizersOnExit or Runtime.runFinalizersOnExit. 
 * The use of finalizers has been deprecated from a long time. 
 * Finalizers can run on live objects while they are being manipulated by other threads.
 * This results in undesirable results or even in a deadlock.
 *
 */
public class Test8 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			try {
				if (i == 4) {
					System.out.println("Inside Try Block.Exiting without executing Finally block.");
					System.exit(0);
				}
			} finally {
				System.out.println("Inside Finally Block.");
			}
		}

	}

}
