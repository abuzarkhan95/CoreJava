package ExecptionHandling;

public class CricketPlayers2 {
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
		CricketPlayers2 pl = new CricketPlayers2();
		System.out.println(pl.player(3));
		System.out.println(pl.player(0, 7));
		System.out.println(pl.player());
		System.out.println(pl.player(1, 2, 3));
		System.out.println(pl.player(3, 6, 4, 8));
	}

}
