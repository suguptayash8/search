package com.para.search.application.payloads;


import lombok.Data;
import lombok.NonNull;


public class TextData {

    @NonNull
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
