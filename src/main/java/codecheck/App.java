package codecheck;

public class App {
	public static void main(String[] args) {
		if (args.length != 1) {
			throw new IllegalArgumentException();
		}

		System.out.println("Hello " + args[0] + "!");
	}
}
