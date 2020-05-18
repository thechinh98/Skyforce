package com.skyforce.packet;

import java.io.Serializable;
import java.util.ArrayList;

import com.skyforce.common.PlayerInGame;

public class StartGameResponsePacket implements Serializable {
    private static final long serialVersionUID = 1L;

    public ArrayList<PlayerInGame> playerInGames;

    public StartGameResponsePacket(ArrayList<PlayerInGame> playerInGames) {
        this.playerInGames = new ArrayList<>();
        this.playerInGames.addAll(playerInGames);
    }
}