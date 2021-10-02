package Concrete;

import Abstract.GameSellService;
import Entities.Campain;
import Entities.Game;
import Entities.Gamer;

public class GameSellManager implements GameSellService {

	private CampainManager campainManager;

	public GameSellManager(CampainManager campainManager) {
		this.campainManager = campainManager;
	}

	public void sell(Gamer gamer, Game game, Campain campain) {

		if (campain.isThereCampain()) {
			
			System.out.println(gamer.getGamerFirstName() + ", " + game.getGameName() + 
					" " + "oyununu sat�n ald�." + " "
					+ campain.getCampainName() + " " + "kampanyas�ndan yararland�");
			System.out.println("oyunun kampanyal� fiyat� : "+campain.getDiscountOfUnitPrice(game));

		} else {
			
			System.out.println(gamer.getGamerFirstName() + ", " + game.getGameName() + 
					" " + "oyununu sat�n ald�.");
			System.out.println("oyunun fiyat� : "+game.getGamePrice());

		}

	}

}
