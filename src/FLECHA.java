package codigos;
import java.util.Scanner;
public class FLECHA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String asterisco = "*";
		int numUser = sc.nextInt();
		for(int aux = 0; aux < numUser; aux++) {
			for(int espacios=0;espacios < aux;espacios++) {
				System.out.print(" ");
			}
			System.out.print(asterisco);
			System.out.println();
		}
		for(int aux = 0; aux < numUser-1; aux++) {
			for(int espacios=numUser-2;espacios > aux;espacios--) {
				System.out.print(" ");
			}
			System.out.print(asterisco);
			System.out.println();
		}
		sc.close();
	}
}