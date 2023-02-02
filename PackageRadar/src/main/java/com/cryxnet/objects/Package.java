package com.cryxnet.objects;

import com.cryxnet.definitions.NetworkObject;

public class NetworkPackage implements NetworkObject {
    private String id;
    private String time;
    private String source;
    private String destination;
    private String protocol;
    private String length;
    private String info;

    public NetworkPackage() {}
    public NetworkPackage(String id, String time, String source, String destination, String protocol, String length, String info) {
        this.id = id;
        this.time = time;
        this.source = source;
        this.destination = destination;
        this.protocol = protocol;
        this.length = length;
        this.info = info;
    }

    @Override
    public NetworkPackage load(String[] data) {
        this.id = data[0];
        this.time = data[1];
        this.source = data[2];
        this.destination = data[3];
        this.protocol = data[4];
        this.length = data[5];
        this.info = data[6];

        return this;
    }

    @Override
    public String toString() {
        return "Package{" +
                "id=" + id +
                ", time=" + time +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", protocol='" + protocol + '\'' +
                ", length='" + length + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
