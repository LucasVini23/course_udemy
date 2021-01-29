import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Candidate;

public class ProgramMap {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new LinkedHashMap<>();
		System.out.print("Entre com o local do arquivo:");
		File file = new File(sc.next());
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			Candidate candidate = null;
			
			
			String line = br.readLine();
			
			while(line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				Integer votes = Integer.parseInt(fields[1]);
				candidate = new Candidate(name, votes);
				
				if(map.containsKey(name)) {
					int votesSoFar = map.get(candidate.getName());
					map.put(candidate.getName(), candidate.getVote() + votesSoFar);
				}
				else {
					map.put(candidate.getName(), candidate.getVote());
				}
				
				line = br.readLine();
			}
			
			for (String key : map.keySet()) {
				System.out.println(key + ": " + map.get(key));
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			sc.close();
		}
		
	}
	
}
