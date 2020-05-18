package com.skyforce.packet;

import java.io.Serializable;
import java.util.ArrayList;

import com.skyforce.common.Bullet;
import com.skyforce.common.Enemy;
import com.skyforce.common.PlayerInGame;

public class UpdateIngameInfoPacket implements Serializable {
    public ArrayList<PlayerInGame> playerInGames;
    public ArrayList<Bullet> bullets;
    public ArrayList<Enemy> enemies;

    public UpdateIngameInfoPacket(ArrayList<PlayerInGame> playerInGames, ArrayList<Bullet> bullets, ArrayList<Enemy> enemies) {
        this.playerInGames = new ArrayList<>();
        this.bullets = new ArrayList<>();
        this.enemies = new ArrayList<>();

        this.playerInGames.addAll(playerInGames);
        this.bullets.addAll(bullets);
        this.enemies.addAll(enemies);
    }
}
