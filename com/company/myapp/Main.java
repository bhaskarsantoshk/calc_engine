package com.company.myapp;

import com.company.calcengine.*;

public class Main {

    public static void main(String[] args) {

    //useCalculateHelper();

        String [] statements ={
                "add 25.0 92.0",
                "power 5.0 2.0"

        };

        DynamicHelper helper= new DynamicHelper(new MathProcessing[]{
                new Adder(),
                new PowerOf()
        });
        for(String statement:statements ){
        String output= helper.process(statement);
        System.out.println(output);
        }





    }


    static void useCalculateHelper(){
        double[] leftVals={100.0d,25.0d,225.0d,11.0d};
        double[] rightVals={50.0d,92.0d,17.0d,3.0d};
        char[] opcodes={'d','a','s','m'};


//        MathEquation testEquation= new MathEquation();
//        testEquation.execute();
//        System.out.print("test is ");
//        System.out.println(testEquation.getResult());
//
        MathEquation[] equations= new MathEquation[4];
        equations[0]=create(100.0d,50.0d,'d');
        equations[1]=create(25.0d,92.0d,'a');
        equations[2]=create(225.0d,17.0d,'s');
        equations[3]=create(11.0d,3.0d,'m');


//        double[] results=new double[opcodes.length];

        for(MathEquation equation: equations){
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.print("Using overloads");
        System.out.println();


        double leftDouble=9.0d;
        double rightDouble=4.0d;

        MathEquation equationOverload= new MathEquation('d');
        equationOverload.execute(leftDouble,rightDouble);

        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        int leftInt=9;
        int rightInt=4;

        equationOverload.execute(leftInt,rightInt);

        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        equationOverload.execute((double)leftInt,rightInt);

        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        System.out.println();
        System.out.println("Using Inheritence");
        System.out.println();

        CalculateBase [] calculators= {
                new Divider(100.0d,50.0d),
                new Adder(25.0d,92.0d),
                new Multiplier(15.0d,3.0d),
                new Substractor(22.0d,15.0d)
        };

        for(CalculateBase calculator: calculators){
            calculator.calculate();
            System.out.print("Result is");
            System.out.println(calculator.getResult());
        }


        String[] statements={
                "add 1.0",
                "add xx 25.0",
                "addX 0.0 0.0",
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        CalculateHelper helper= new CalculateHelper();
        for(String statement: statements){
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch(InvalidStatementException e){
                System.out.println(e.getMessage());
                if(e.getCause()!=null){
                    System.out.println(" Original Exception: "+ e.getCause().getMessage());
                }
            }
        }





    }

    public static MathEquation create(double leftVal,double rightVal,char opcode){
        MathEquation equation= new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opcode);
        return equation;
    }
}
