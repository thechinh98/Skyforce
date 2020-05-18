package com.skyforce.packet;

import java.io.Serializable;
import java.util.ArrayList;

import com.skyforce.server.ClientInRoom;

public class UpdateRoomInfoPacket implements Serializable {
    private static final long serialVersionUID = 1L;

    public ArrayList<ClientInRoom> clients;
    public int level;

    public UpdateRoomInfoPacket() {
    }

    public UpdateRoomInfoPacket(ArrayList<ClientInRoom> clients, int level) {
        this.clients = new ArrayList<>();
        this.clients.addAll(clients);
        this.level = level;
    }
}
