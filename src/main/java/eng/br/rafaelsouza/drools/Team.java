package eng.br.rafaelsouza.drools;

/**
 *
 * @author Rafael Souza
 */
public class Team {
	
	private String name;
	private int points;

	public Team() {
	}

	public Team(String name, int points) {
		this.name = name;
		this.points = points;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	
	
}
