import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class ProgramStream {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<Employee>();
//		Double sum = 0.0;
		
		System.out.print("Enter full file path: ");
		
		try(BufferedReader br = new BufferedReader(new FileReader(sc.next()))){
			
			String lines = br.readLine();
			while(lines != null) {
				
				String[] fields = lines.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				lines = br.readLine();
				
			}
			
//			Organizar a Lista
//			list.sort((e1, e2) -> e1.getName().toUpperCase().compareTo(e2.getName().toUpperCase()));
			
			System.out.print("Enter salary: ");
			Double salary = sc.nextDouble();
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f%", salary) + ":");
//			Stream<String> stream = list.stream().filter(e -> e.getSalary() > salary).map(Employee::getEmail);
			List<String> emails = list.stream().filter(e -> e.getSalary() > salary).map(Employee::getEmail).sorted().collect(Collectors.toList());
			emails.forEach(System.out::println);
			
//			List<Employee> listWithM = list.stream().filter(e -> e.getName().startsWith("M")).collect(Collectors.toList());
//			for (Employee employee : listWithM) {
//				sum += employee.getSalary();
//			}
			
			double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Sum of salary of people whose name starts with 'M': " + sum);
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException" + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException" + e.getMessage());
		}
		sc.close();
	}
	

}
