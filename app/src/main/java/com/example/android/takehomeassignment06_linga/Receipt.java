package com.example.android.takehomeassignment06_linga;

import java.io.Serializable;

public class Receipt implements Serializable {
    double sAmount;
    double sTax;
    double sTip;

    public double getsAmount() {
        return sAmount;
    }

    public void setsAmount(double sAmount) {
        this.sAmount = sAmount;
    }

    public double getsTax() {
        return sTax;
    }

    public void setsTax(double sTax) {
        this.sTax = sTax;
    }

    public double getsTip() {
        return sTip;
    }

    public void setsTip(double sTip) {
        this.sTip = sTip;
    }

    public Receipt(double sAmount, double sTax, double sTip) {
        this.sAmount = sAmount;
        this.sTax = sTax;
        this.sTip = sTip;
    }

    @Override
    public String toString() {
        return "Total: "+ sAmount+
                "\nSales Tax: " + sTax*sAmount+
                "\nTip: "+ sTip*sAmount +
                "Grand Total: "+sAmount*(1+sTax+sTip);

    }


}
