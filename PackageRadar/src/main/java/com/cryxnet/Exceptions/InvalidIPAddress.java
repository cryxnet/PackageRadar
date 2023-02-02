package com.cryxnet.Exceptions;

/**
 * Custom Exception for Invalid ip addresses
 */
public class InvalidIPAddress extends Exception {
    public InvalidIPAddress(String message) {
        super(message);
    }
}
