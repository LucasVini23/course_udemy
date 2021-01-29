package entities;

public class Candidate {
	
	private String name;
	private Integer vote;
	
	
	
	public Candidate(String name, Integer vote) {
		this.name = name;
		this.vote = vote;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getVote() {
		return vote;
	}
	public void setVote(Integer vote) {
		this.vote = vote;
	}
	
	

}
