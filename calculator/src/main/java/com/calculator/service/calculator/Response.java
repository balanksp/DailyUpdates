package com.calculator.service.calculator;

public class Response {
    private String operation ;
    private int a ;
    private int b ;
    private int result;
    
    public Response(String operation ,int a, int b, int result) {
        this.a = a;
        this.b = b;
        this.result = result;
        this.operation = operation;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    
    
    
    
}
