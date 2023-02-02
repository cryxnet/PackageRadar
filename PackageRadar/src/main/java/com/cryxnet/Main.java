/**
 * @author: cryxnet
 * @version: v1.0.0
 * @description: This Tool is used to analyze Wireshark CSV files automated
 */

package com.cryxnet;
import com.cryxnet.Exceptions.InvalidIPAddress;
import com.cryxnet.services.Analyzer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    private static final String header = new String("""
             ______            _                      ______            _            \s
            (_____ \\          | |                    (_____ \\          | |           \s
             _____) )___  ____| |  _ ____  ____  ____ _____) ) ____  _ | | ____  ____\s
            |  ____/ _  |/ ___) | / ) _  |/ _  |/ _  |_____ ( / _  |/ || |/ _  |/ ___)
            | |   ( ( | ( (___| |< ( ( | ( ( | ( (/ /      | ( ( | ( (_| ( ( | | |   \s
            |_|    \\_||_|\\____)_| \\_)_||_|\\_|| |\\____)     |_|\\_||_|\\____|\\_||_|_|   \s
                                         (_____|                                     \s
            """);

    public static void main(String[] args) throws InvalidIPAddress, IOException {
        Scanner input = new Scanner(System.in);
        Analyzer analyzer = new Analyzer();

        while (true) {
            System.out.println(header);
            System.out.println("------------------------------");
            System.out.println(" 1. Analyze a capture file");
            System.out.println(" 2. Quit");
            System.out.print("\nEnter your choice: ");

            int choice = input.nextInt();

            if (choice == 2) {
                break;
            }

            if (choice == 1) {
                System.out.print("\nEnter the path of the capture file: ");
                input.nextLine();
                String filePath = input.nextLine();

                System.out.println("Loading...");

                ArrayList<String> res = analyzer.analyze(filePath);

                System.out.println("\nResults:");
                for (String a : res) {
                    System.out.println(a);
                }
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("This doesn't exists...");
                continue;
            }
        }
        System.out.println("\nQuitting... bye!");
        input.close();
    }
}