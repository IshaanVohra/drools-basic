package eng.br.rafaelsouza.drools;

/**
 *
 * @author Rafael Souza
 */
public class Match {
	
	private Team home;
	private Team visitant;
	private int homeScoreboard;
	private int visitantScoreboard;

	public Match() {
	}

	public Match(Team home, Team visitant, int homeScoreboard, int visitantScoreboard) {
		this.home = home;
		this.visitant = visitant;
		this.homeScoreboard = homeScoreboard;
		this.visitantScoreboard = visitantScoreboard;
	}

	public Team getHome() {
		return home;
	}

	public void setHome(Team home) {
		this.home = home;
	}

	public Team getVisitant() {
		return visitant;
	}

	public void setVisitant(Team visitant) {
		this.visitant = visitant;
	}

	public int getHomeScoreboard() {
		return homeScoreboard;
	}

	public void setHomeScoreboard(int homeScoreboard) {
		this.homeScoreboard = homeScoreboard;
	}

	public int getVisitantScoreboard() {
		return visitantScoreboard;
	}

	public void setVisitantScoreboard(int visitantScoreboard) {
		this.visitantScoreboard = visitantScoreboard;
	}
	
}
