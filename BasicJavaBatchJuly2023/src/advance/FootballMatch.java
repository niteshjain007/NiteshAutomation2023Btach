package advance;

public class FootballMatch implements Football{

	public static void main(String[] args) {
		
		Football fb1 = new FootballMatch();
		// Webdriver driver = new chromDriver();
		fb1.setHomeTeam("brazil");
		fb1.setVisitingTeam("spain");
		fb1.homeTeamScored(3);
		fb1.visitingTeamScored(5);
	}

	@Override
	public void setHomeTeam(String name) {
		System.out.println("home team is = "+ name);
		
	}

	@Override
	public void setVisitingTeam(String name) {
		System.out.println("visiting team is = "+ name);
		
	}

	@Override
	public void homeTeamScored(int points) {
		System.out.println("home team score = "+ points);
		
	}

	@Override
	public void visitingTeamScored(int points) {
		System.out.println("visiting team score = "+ points);
		
	}

	@Override
	public void endOfQuarter(int quarter) {
		System.out.println("quarter end = "+ quarter);
		
	}

}
