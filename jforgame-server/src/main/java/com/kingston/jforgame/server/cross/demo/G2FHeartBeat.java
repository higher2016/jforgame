package com.kingston.jforgame.server.cross.demo;

import com.kingston.jforgame.server.cross.core.CrossCommands;
import com.kingston.jforgame.server.game.Modules;
import com.kingston.jforgame.socket.annotation.MessageMeta;
import com.kingston.jforgame.socket.message.Message;

@MessageMeta(module = Modules.CROSS, cmd  = CrossCommands.G2F_HEART_BEAT)
public class G2FHeartBeat extends Message {

    private long time = System.currentTimeMillis();

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
