import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = 0;
		Set<Integer> student = new HashSet<>();
//		Set<Integer> a = new HashSet<>();
//		Set<Integer> b = new HashSet<>();
//		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A?");
		number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			student.add(sc.nextInt());
		}
		System.out.print("How many students for course B?");
		number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			student.add(sc.nextInt());
		}
		System.out.print("How many students for course C?");
		number = sc.nextInt();
		for (int i = 0; i < number; i++) {
			student.add(sc.nextInt());
		}
		
//		Set<Integer> total = new HashSet<>(a);
//		total.addAll(b);
//		total.addAll(c);
		
		System.out.println("Total students: " + student.size());
		
	}
	
}
