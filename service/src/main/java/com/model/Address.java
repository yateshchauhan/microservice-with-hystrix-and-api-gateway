package com.model;

public class Address {

    private String permanentAddr;
    private String localAddr;

    public Address(String permanentAddr, String localAddr) {
        this.permanentAddr = permanentAddr;
        this.localAddr = localAddr;
    }

    public Address() {
    }

    public String getPermanentAddr() {
        return permanentAddr;
    }

    public void setPermanentAddr(String permanentAddr) {
        this.permanentAddr = permanentAddr;
    }

    public String getLocalAddr() {
        return localAddr;
    }

    public void setLocalAddr(String localAddr) {
        this.localAddr = localAddr;
    }

    @Override
    public String toString() {
        return "Address{" +
                "permanentAddr='" + permanentAddr + '\'' +
                ", localAddr='" + localAddr + '\'' +
                '}';
    }
}
