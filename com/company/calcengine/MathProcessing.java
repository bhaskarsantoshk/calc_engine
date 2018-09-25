package com.company.calcengine;

public interface MathProcessing {
    String SEPARATOR=" ";
    String getKeyWord(); //add
    String getSymbol(); //+
    double doCalculation(double leftVal,double rightVal);



}
