package com.hyeok.inflearn.intellij.chap1.view;

public class ViewDefinition {

    public void viewDefinition() {
        EmailSender emailSender = new EmailSender(1L, "jojoldu", "jojoldu@gmail.com");

        emailSender.send("test@gmail.com");
    }
}
