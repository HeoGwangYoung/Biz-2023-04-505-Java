package com.callor.blackjack.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.blackjack.service.impl.DeckServiceImplV1;
import com.callor.blackjack.service.impl.PlayerServiceImplV1;

public class BlackJackService {

	protected final List<PlayerService> playerList;
	protected final DeckService deckService;

	public BlackJackService() {
		playerList = new ArrayList<>();
		deckService = new DeckServiceImplV1();
	}

	public void gameStart() {
		playerList.add(new PlayerServiceImplV1());
		playerList.add(new PlayerServiceImplV1("타짜"));
		playerList.add(new PlayerServiceImplV1("영수"));

		for (int i = 0; i < 2; i++) {
			for (PlayerService player : playerList) {
				player.hit(deckService.getDeck());
			}
		}

		if (playerList.get(0).getScore() < 17) {
			playerList.get(0).hit(deckService.getDeck());
		}

		for (PlayerService player : playerList) {
			player.showDeck();
		}

		// play가 다수일 경우 승부를 어떻게 계산할 것인가?
		int winnerScore = 0;
		String winnerPlayer = "";
		for (PlayerService player : playerList) {
			if (winnerScore < player.getScore() && player.getScore() < 22) {
				winnerScore = player.getScore();
				winnerPlayer = player.getPlayName();
			}
		}
		System.out.printf("%s 승리, 점수 : %d\n", winnerPlayer, winnerScore);
		System.out.println();
		// 딜러(0 번 player)와 각 게이머간의 점수를 비교하여
		// 딜러 : 타짜 = 타짜승, 딜러 : 영수 = 영수승 을 출력
		// 단 각 player 의 점수가 21점 초과하면 무조건 패
		// 동점이면 무승부

		System.out.println(playerList.get(0).getPlayName() + " 점수 : " + playerList.get(0).getScore());
		for (int i = 1; i < playerList.size(); i++) {
						
			if (playerList.get(i).getScore() > playerList.get(0).getScore() && playerList.get(i).getScore() < 22) {
				System.out.println(playerList.get(i).getPlayName() + " 점수 : "+ playerList.get(i).getScore() + " 승리");
			} else if(playerList.get(i).getScore() == playerList.get(0).getScore()){
				System.out.println(playerList.get(i).getPlayName() + " 점수 : "+ playerList.get(i).getScore() + " 무승부");
			} else {
				System.out.println(playerList.get(i).getPlayName() + " 점수 : "+ playerList.get(i).getScore() + " 패배");
			}
		}
	}
}
