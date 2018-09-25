package com.company.calcengine;

public class Substractor extends CalculateBase {

    public Substractor(){

    }

    public Substractor(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }

    @Override
    public void calculate(){
        double value= getLeftVal()-getRightVal();
        setResult(value);
    }


}
