package com.skyforce.packet;

import java.io.Serializable;

public class ClosedServerNotificationPacket implements Serializable {
    private static final long serialVersionUID = 1L;

    public String message;

    public ClosedServerNotificationPacket() {

    }

    public ClosedServerNotificationPacket(String message) {
        this.message = message;
    }
}
