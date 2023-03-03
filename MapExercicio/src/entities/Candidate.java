package entities;

public class Candidate {
	private String name;
	private Integer numberVotes;
	
	public Candidate(String name, Integer numberVotes) {	
		this.name = name;
		this.numberVotes = numberVotes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumberVotes() {
		return numberVotes;
	}
	public void setNumberVotes(Integer numberVotes) {
		this.numberVotes = numberVotes;
	}
	
	
}
