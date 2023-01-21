package com.example.demo.pattern.interpreter;


public class Substract implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public Substract(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    /**
     * @return
     */
    @Override
    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }

}
