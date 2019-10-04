package com.nisum.stomas.demo.digitalproduct.error;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Error")
public class ErrorJSON {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
