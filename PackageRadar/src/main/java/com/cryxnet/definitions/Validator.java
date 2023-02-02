package com.cryxnet.definitions;

import com.cryxnet.Exceptions.InvalidIPAddress;

import java.util.regex.Pattern;

/**
 * Interface for Validators
 */
public interface Validator {
    boolean validate(String target) throws InvalidIPAddress;
}
