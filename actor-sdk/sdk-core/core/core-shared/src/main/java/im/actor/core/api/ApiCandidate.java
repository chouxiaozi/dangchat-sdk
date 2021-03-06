package im.actor.core.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.runtime.bser.*;
import im.actor.runtime.collections.*;
import static im.actor.runtime.bser.Utils.*;
import im.actor.core.network.parser.*;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.j2objc.annotations.ObjectiveCName;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ApiCandidate extends ApiWebRTCSignaling {

    private long sessionId;
    private int index;
    private String id;
    private String sdp;

    public ApiCandidate(long sessionId, int index, @NotNull String id, @NotNull String sdp) {
        this.sessionId = sessionId;
        this.index = index;
        this.id = id;
        this.sdp = sdp;
    }

    public ApiCandidate() {

    }

    public int getHeader() {
        return 3;
    }

    public long getSessionId() {
        return this.sessionId;
    }

    public int getIndex() {
        return this.index;
    }

    @NotNull
    public String getId() {
        return this.id;
    }

    @NotNull
    public String getSdp() {
        return this.sdp;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.sessionId = values.getLong(1);
        this.index = values.getInt(2);
        this.id = values.getString(3);
        this.sdp = values.getString(4);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeLong(1, this.sessionId);
        writer.writeInt(2, this.index);
        if (this.id == null) {
            throw new IOException();
        }
        writer.writeString(3, this.id);
        if (this.sdp == null) {
            throw new IOException();
        }
        writer.writeString(4, this.sdp);
    }

    @Override
    public String toString() {
        String res = "struct Candidate{";
        res += "sessionId=" + this.sessionId;
        res += ", index=" + this.index;
        res += ", id=" + this.id;
        res += ", sdp=" + this.sdp;
        res += "}";
        return res;
    }

}
