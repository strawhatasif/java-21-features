package com.fun.java.switches;

import java.math.BigDecimal;

public final class ManagementRole implements Employee {
    @Override
    public BigDecimal determineBonus(double salary) {
        System.out.println("Member of Management");
        return Employee.super.determineBonus(salary);
    }
}
