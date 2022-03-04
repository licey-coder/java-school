package com.shpp.p2p.cs.skosiak.assignment3;

import com.shpp.cs.a.console.TextProgram;

public class Assignment3Part1 extends TextProgram {
    public void run() {
        int cardio = 0;
        int press = 0;
        for (int i = 1; i < 8; i++) {
            int tr = readInt("How many minutes did you do on day " + i + "?");
            if (tr >= 40) {
                cardio++;
                press++;
            } else if (tr >= 30 && tr < 40) {
                cardio++;
            }
        }

        if (cardio >= 5 && press >= 3) {
            print("Cardiovascular health: \n" +
                          "Great job! You've done enough exercise for cardiovascular health.\n" +
                    "Blood pressure: \n" +
                        "Great job! You've done enough exercise to keep a low blood pressure.");
        } else if (cardio >= 5 && press < 3) {
            print("Cardiovascular health: \n" +
                    "Great job! You've done enough exercise for cardiovascular health. \n" +
                    "Blood pressure: \n" +
                    "You needed to train hard for at least " + (3 - press) + " more day(s) a week!");

        } else if (cardio < 5 && press >= 3) {
            print("Cardiovascular health: \n" +
                    "You needed to train hard for at least " + (5 - cardio) + " more day(s) a week!\n" +
                    "Blood pressure: \n" +
                    "Great job! You've done enough exercise to keep a low blood pressure.");

        } else {
            print("Cardiovascular health: \n" +
                    "You needed to train hard for at least " + (5 - cardio) + " more day(s) a week!\n " +
                    "Blood pressure: \n" +
                    "You needed to train hard for at least " + (3 - press) + " more day(s) a week!");

        }

    }

}
