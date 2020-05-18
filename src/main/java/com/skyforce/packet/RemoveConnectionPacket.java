package com.skyforce.packet;

import java.io.Serializable;

public class RemoveConnectionPacket implements Serializable {
    private static final long serialVersionUID = 1L;

    public int id;
    public String playerName;

    public RemoveConnectionPacket() {
    }

    public RemoveConnectionPacket(int id, String playerName) {
        this.id = id;
        this.playerName = playerName;
    }
}
