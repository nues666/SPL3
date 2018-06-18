
public class Taschenrechner {
	public static void main(String[] args) {
		int zahl1 = Integer.parseInt(args[0]);
		int zahl2 = Integer.parseInt(args[2]);

		if (args[1].equals("+")) {
			System.out.println("Summe: " + (zahl1 + zahl2));
		}
		if (args[1].equals("-")) {
			System.out.println("Summe: " + (zahl1 - zahl2));
		}
		if (args[1].equals("*")) {
			System.out.println("Summe: " + zahl1 * zahl2);
		}
		if (args[1].equals("/")) {
			System.out.println("Summe: " + zahl1 / zahl2);
		}
	}

}
