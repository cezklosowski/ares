package com.cezklosowski.core.error;

import java.util.List;

public class ErrorResponse {

    public ErrorResponse(List<String> errors) {
        this.errors = errors;
    }

    private List<String> errors;

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
