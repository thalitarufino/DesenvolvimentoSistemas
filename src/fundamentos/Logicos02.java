package fundamentos;

public class Logicos02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			System.out.println("Atividade 01");
			boolean a1 = true;
			System.out.println(!a1);
			System.out.println(!false);
			System.out.println(!(2 < 5));

			System.out.println("\nAtividade 02");
			boolean a2 = true;
			boolean b2 = false;
			boolean c2 = true;
			System.out.println(a2 & b2);
			System.out.println(a2 & c2);
			System.out.println(false & (2 > 5));
			System.out.println((2 < 5) & false);

			System.out.println("\nAtividade 03");
			boolean a3 = true;
			boolean b3 = false;
			boolean c3 = true;
			System.out.println(!a3 || b3);
			System.out.println(a3 || c3); // ou
			System.out.println((2 < 5) | false);
			System.out.println((2 > 5) | true);

			System.out.println("\nAtividade 04");
			boolean a4 = true;
			boolean b4 = false;
			boolean c4 = true;
			System.out.println(!a4 ^ b4);
			System.out.println(a4 ^ c4);
			System.out.println((2 < 5) ^ false);
			System.out.println((2 > 5) ^ true);

			System.out.println("\nAtividade 05");
			boolean a5 = true, b5 = true, c5 = false;
			System.out.println(a5 || b5 & c5);

		}
	}
}