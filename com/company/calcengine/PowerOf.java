package com.company.calcengine;

public class PowerOf implements MathProcessing{

    @Override
    public String getKeyWord() {
        return "power";
    }

    @Override
    public String getSymbol() {
        return "^";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return Math.pow(leftVal,rightVal);
    }
}
