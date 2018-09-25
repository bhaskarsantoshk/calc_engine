package com.company.calcengine;

public class Adder extends CalculateBase implements MathProcessing{

    public Adder(){

    }

    public Adder(double leftVal, double rightVal){

        super(leftVal,rightVal);
        System.out.println(1);
    }

    @Override
    public void calculate(){
        System.out.println(2);
        double value= getLeftVal()+getRightVal();
        setResult(value);
    }

    @Override
    public String getKeyWord() {
        return "add";
    }

    @Override
    public String getSymbol() {
        return "+";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}
