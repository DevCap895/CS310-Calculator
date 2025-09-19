package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

/**
 * Binary modulo operation
 */
public class Modulo extends AbstractOperation implements BinaryOperation {

    @Override
    public float perform(float arg1, float arg2) {
        // Handle division by zero for modulo as well
        if (arg2 == 0) {
            throw new ArithmeticException("Modulo by zero.");
        }
        return arg1 % arg2;
    }

    @Override
    public String getName() {
        return "%";
    }

}