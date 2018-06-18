
public class test {

	public static void main(String[] args) {
		
//		args[0] = "Hallo";
		System.out.println(args.length);
		
		for(int i =0; i<args.length;i++) {
			System.out.println(args[i]);
		}
		if(args[2].equals("kaufe")) {
			System.out.println("Am Stizzle!");
		}

	}

}
