package ch11;

public class StuInfo {
	
	private String name;
	private String score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "StuInfo [name=" + name + ", score=" + score + "]";
	}
	
	

}
