package beans;

public interface Game {
	
	Team getFirst();
	void setFirst(Team third);
	Team getSecond();
	void setSecond(Team second);
	Team getThird();
	void setThird(Team third);
	String playGame();

}
