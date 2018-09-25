package com.company.calcengine;

public class DynamicHelper {
    private MathProcessing[] handlers;

    public DynamicHelper(MathProcessing[] handlers){
        this.handlers=handlers;
    }

    public DynamicHelper(){

    }

    public String process(String statement){
        //IN : add 1.0 2.0
        //OUT: 1.0 + 2.0 = 3.0
        String []parts=statement.split(MathProcessing.SEPARATOR);
        String keyword=parts[0];
        MathProcessing theHandler=null;

        for(MathProcessing handler: handlers){
            if(keyword.equalsIgnoreCase(handler.getKeyWord())){
                theHandler=handler;
                break;
            }
        }

        double leftVal= Double.parseDouble(parts[1]);
        double rightVal= Double.parseDouble(parts[2]);
        double result= theHandler.doCalculation(leftVal,rightVal);

        StringBuilder sb= new StringBuilder(20);
        sb.append(leftVal);
        sb.append(' ');
        sb.append(theHandler.getSymbol());
        sb.append(' ');
        sb.append(rightVal);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();

    }
}
