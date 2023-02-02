package com.cryxnet.objects;

import com.cryxnet.definitions.NetworkObject;

public class Package implements NetworkObject {
    private int id;
    private float time;
    private String source;
    private String destination;
    private String protocol;
    private String length;
    private String info;

    public Package() {}
    public Package(int id, float time, String source, String destination, String protocol, String length, String info) {
        this.id = id;
        this.time = time;
        this.source = source;
        this.destination = destination;
        this.protocol = protocol;
        this.length = length;
        this.info = info;
    }

    @Override
    public Package load(String[] data) {
        this.id = Integer.parseInt(data[0]);
        this.time = Float.parseFloat(data[1]);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
