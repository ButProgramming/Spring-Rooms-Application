package com.mycompany.app.room;

public class RoomNotFoundException extends Throwable {
    public RoomNotFoundException(String message) {
        super(message);
    }
}
