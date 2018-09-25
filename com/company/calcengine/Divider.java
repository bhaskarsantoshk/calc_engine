package com.company.calcengine;

public class Divider extends CalculateBase {

    public Divider(){

    }

    public Divider(double leftVal,double rightVal){
        super(leftVal,rightVal);
    }

    public void calculate(){
        double value= (rightVal!=0)? getLeftVal() /getRightVal() : 0;
        setResult(value);
    }
}
