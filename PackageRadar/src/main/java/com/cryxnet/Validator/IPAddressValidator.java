package com.cryxnet.Validator;

import com.cryxnet.Exceptions.InvalidIPAddress;
import com.cryxnet.definitions.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidator implements Validator {
    private static final Pattern validIP = Pattern.compile("^(((\\d|[1-9]\\d|1\\d\\d|2([0-4]\\d|5[0-5])).){3}(\\d|[1-9]\\d|1\\d\\d|2([0-4]\\d|5[0-5]))|(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)))$");

    /**
     * This method is used to validate ip addresses
     * @param target
     * @return boolean if the ip address is valid
     * @throws InvalidIPAddress
     */
    public boolean validate(String target) throws InvalidIPAddress {
        Matcher matcher = validIP.matcher(target);

        if (!matcher.matches()) {
            throw new InvalidIPAddress("The given String isn't a ipaddress");
        }

        return matcher.matches();
    }
}