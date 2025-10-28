package com.hyeok.inflearn.intellij.chap2.special;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
public class FocusCopy {

    public void copy() {
        List<String> members = new ArrayList<>();

        members.add(new Member().getName());
        members.add(new Member().getName());
        members.add(new Member().getName());
        members.add(new Member().getName());
        members.add(new Member().getName());
    }
}
