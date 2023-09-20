package com.fun.java.switches;

import java.math.BigDecimal;

sealed interface Employee permits IndividualContributorRole, ManagementRole {
    default BigDecimal determineBonus(double salary) {
        return BigDecimal.valueOf(salary);
    }
}
