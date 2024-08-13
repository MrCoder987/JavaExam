package com.crimsonlogic.exception;

import com.crimsonlogic.model.Employee;

public class InvalidEmployeeIDException extends Exception {
    public InvalidEmployeeIDException(String m) {
        super(m);
    }
}
