package com.example.demo.domain;

import java.util.List;

/**
 * Created by wangjinzhao on 2017/5/15.
 */
public class Hello {
    private int a;
    private int b;
    private int c;
    private List<World> worlds;

    public Hello(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public List<World> getWorlds() {
        return worlds;
    }

    public void setWorlds(List<World> worlds) {
        this.worlds = worlds;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
