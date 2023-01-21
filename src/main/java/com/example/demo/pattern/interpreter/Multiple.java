package com.example.demo.pattern.interpreter;

public class Multiple implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    /**
     * 构造乘法
     *
     * @param leftExpression  左表达式
     * @param rightExpression 右表达式
     */
    public Multiple(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    /**
     * 乘法
     *
     * @return 乘法结果
     */
    @Override
    public int interpret() {
        return leftExpression.interpret() * rightExpression.interpret();
    }

}
