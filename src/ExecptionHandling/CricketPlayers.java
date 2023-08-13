package ExecptionHandling;

public class CricketPlayers {
	String player(int a) {
		return "Yuzi Chahal";
	}

	String player(int a, int b) {
		return "MS Dhoni";
	}

	String player(int... p) {
		return "Player";
	}

	public static void main(String[] args) {
		CricketPlayers pl=new CricketPlayers();
		pl.player(3);
		pl.player(0,7);
		pl.player();
		pl.player(1,2,3);
		pl.player(3,6,4,8);

	}

}
