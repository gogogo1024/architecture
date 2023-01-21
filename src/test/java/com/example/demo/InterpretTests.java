package com.example.demo;

import com.example.demo.pattern.Interpreter.Expression;
import com.example.demo.pattern.Interpreter.ExpressionUtils;
import com.example.demo.pattern.Interpreter.Numbers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Stack;

@SpringBootTest
public class InterpretTests {

    @Test
    void arithmeticTest() {
        String tokenString = "7 3 - 2 1 + *"; // 等价于 4 * 3
        Stack<Expression> stack = new Stack<>();
        String[] tokenArray = tokenString.split(" ");
        for (String s : tokenArray) {
            if (ExpressionUtils.isOperator(s)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = ExpressionUtils.getOperator(s, leftExpression, rightExpression);
                int result = operator.interpret();
                stack.push(new Numbers(result));
            } else {
                Expression i = new Numbers(Integer.parseInt(s));
                stack.push(i);
            }
        }
        System.out.println("( " + tokenString + " ): " + stack.pop().interpret());
    }
}
