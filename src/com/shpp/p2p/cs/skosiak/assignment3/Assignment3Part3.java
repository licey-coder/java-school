package com.shpp.p2p.cs.skosiak.assignment3;

import com.shpp.cs.a.console.TextProgram;
//Піднесення до степеня
public class Assignment3Part3 extends TextProgram {
    public void run() {
        print(raiseToPower(1./2, 3));
    }


    private double raiseToPower(double base, int exponent) {
            double ans=0.0;
        if (exponent > 0) {
            ans = base;
            for (int i = 1; i < exponent; i++) {
                ans = ans * base;
            }

        } else if (exponent < 0) {
            ans = 1;
            while (exponent<0) {
                ans = ans / base;
                exponent++;
            }

        }
        else {ans = 1;}
        return ans;
    }
}
