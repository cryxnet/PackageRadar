package com.cryxnet.services;

import com.cryxnet.Exceptions.InvalidIPAddress;
import com.cryxnet.Utils.CSVReader;
import com.cryxnet.Validator.IPAddressValidator;
import com.cryxnet.objects.CSV;
import com.cryxnet.objects.Package;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Analyzer {
    private API api = new API();
    private IPAddressValidator validator = new IPAddressValidator();

    public Analyzer() {}

    public ArrayList<String> analyze(String filepath) throws InvalidIPAddress, IOException {
        CSVReader reader = new CSVReader();
        CSV csv = reader.read(filepath);
        ArrayList<Package> packages = new ArrayList<Package>();
        HashSet<String> ipaddrs = new HashSet<String>();
        ArrayList<String> results = new ArrayList<String>();

        for (String[] values : csv.getValues()) {
            Package networkPackage = new Package();
            networkPackage.load(values);

            packages.add(networkPackage);
        }

        for (Package p : packages) {
            String srcIP = p.getSource();
            String destIP = p.getDestination();

            validator.validate(srcIP);
            validator.validate(destIP);

            ipaddrs.add(srcIP);
            ipaddrs.add(destIP);
        }

        for (String a : ipaddrs) {
            String res = api.getIPInformation(a);
            results.add(res);
        }

        return results;
    }
}
