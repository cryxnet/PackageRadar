package com.cryxnet.definitions;

public interface NetworkObject {
    /**
     * Method to load data into the networkobject
     * @param data
     * @return given class
     * @param <T>
     */
    <T> T load(String[] data);
}
