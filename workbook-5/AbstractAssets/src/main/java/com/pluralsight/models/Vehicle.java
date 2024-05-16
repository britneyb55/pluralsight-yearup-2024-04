
package com.pluralsight.models;

import java.time.LocalDate;

public class Vehicle extends Asset
{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dataAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dataAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue()
    {
        LocalDate year = LocalDate.now();
        int yearold = year.getYear() - getYear();


        switch(yearold)
        {

            case 1:

                if (getOdometer() >= 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
                    double reduction = getOriginalCost() * 0.03;
                    double fristReduction = getOriginalCost() - reduction;

                    double reductonTwo = fristReduction * 0.25;
                    double finalReduction = fristReduction - reductonTwo;
                    return Math.round(finalReduction);

                }
                else
                {
                    double reduceValue = getOriginalCost() * 0.03;
                    return getOriginalCost() - reduceValue;

                }


            case 2:
                if (getOdometer() >= 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
                    double reduction = getOriginalCost() * 0.06;
                    double fristReduction = getOriginalCost() - reduction;

                    double reductonTwo = fristReduction * 0.25;
                    double finalReduction = fristReduction - reductonTwo;
                    return finalReduction;

                }
                else {
                    double reduceValue1 = getOriginalCost() * 0.06;
                    return getOriginalCost() - reduceValue1;
                }

            case 3:

                if (getOdometer() >= 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
                    double reduction = getOriginalCost() * 0.09;
                    double fristReduction = getOriginalCost() - reduction;

                    double reductonTwo = fristReduction * 0.25;
                    double finalReduction = fristReduction - reductonTwo;
                    return finalReduction;

                }
                else {
                    double reduceValue2 = getOriginalCost() * 0.09;
                    return getOriginalCost() - reduceValue2;
                }

            case 4:
                if (getOdometer() >= 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
                    double reduction = getOriginalCost() * 0.24;
                    double fristReduction = getOriginalCost() - reduction;

                    double reductonTwo = fristReduction * 0.25;
                    double finalReduction = fristReduction - reductonTwo;
                    return finalReduction;

                }
                else {
                    double reduceValue3 = getOriginalCost() * 0.24;
                    return getOriginalCost() - reduceValue3;
                }
            case 5:
                if (getOdometer() >= 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
                    double reduction = getOriginalCost() * 0.30;
                    double fristReduction = getOriginalCost() - reduction;

                    double reductonTwo = fristReduction * 0.25;
                    double finalReduction = fristReduction - reductonTwo;
                    return finalReduction;

                }
                else {
                    double reduceValue4 = getOriginalCost() * 0.30;
                    return getOriginalCost() - reduceValue4;
                }
            case 6:
                if (getOdometer() >= 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
                    double reduction = getOriginalCost() * 0.36;
                    double fristReduction = getOriginalCost() - reduction;

                    double reductonTwo = fristReduction * 0.25;
                    double finalReduction = fristReduction - reductonTwo;
                    return finalReduction;

                }
                else {
                    double reduceValue5 = getOriginalCost() * 0.36;
                    return getOriginalCost() - reduceValue5;
                }
            case 7:
                if (getOdometer() >= 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
                    double reduction = getOriginalCost() * 0.56;
                    double fristReduction = getOriginalCost() - reduction;

                    double reductonTwo = fristReduction * 0.25;
                    double finalReduction = fristReduction - reductonTwo;
                    return finalReduction;

                }
                else {
                    double reduceValue6 = getOriginalCost() * 0.56;
                    return getOriginalCost() - reduceValue6;
                }
            case 8:
                if (getOdometer() >= 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
                    double reduction = getOriginalCost() * 0.64;
                    double fristReduction = getOriginalCost() - reduction;

                    double reductonTwo = fristReduction * 0.25;
                    double finalReduction = fristReduction - reductonTwo;
                    return finalReduction;

                }
                else {
                    double reduceValue7 = getOriginalCost() * 0.64;
                    return getOriginalCost() - reduceValue7;
                }

            case 9:
                if (getOdometer() >= 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
                    double reduction = getOriginalCost() * 0.72;
                    double fristReduction = getOriginalCost() - reduction;

                    double reductonTwo = fristReduction * 0.25;
                    double finalReduction = fristReduction - reductonTwo;
                    return finalReduction;

                }
                else {
                    double reduceValue8 = getOriginalCost() * 0.72;
                    return getOriginalCost() - reduceValue8;
                }
            case 10:
                if (getOdometer() >= 100000 && !getMakeModel().contains("Honda") && !getMakeModel().contains("Toyota")) {
                    double reduction = getOriginalCost() * 0.80;
                    double fristReduction = getOriginalCost() - reduction;

                    double reductonTwo = fristReduction * 0.25;
                    double finalReduction = fristReduction - reductonTwo;
                    return finalReduction;

                }
                else {
                    double reduceValue9 = getOriginalCost() * 0.80;
                    return getOriginalCost() - reduceValue9;
                }
            default:

                return 1000.00;


        }


    }
}
