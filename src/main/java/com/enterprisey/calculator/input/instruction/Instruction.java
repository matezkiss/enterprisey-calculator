package com.enterprisey.calculator.input.instruction;

public interface Instruction {

    default boolean executable() {
        return false;
    }

    default void execute() {
        throw new RuntimeException("This is not an executable instruction!");
    }

}
