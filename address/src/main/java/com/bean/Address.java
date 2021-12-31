package com.bean;

public class Address {

    private String permanentAddr;
    private String localAddr;
    private long employeeId;

    public Address(long employeeId, String permanentAddr, String localAddr) {
        this.permanentAddr = permanentAddr;
        this.localAddr = localAddr;
        this.employeeId = employeeId;
    }

    public Address() {
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
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
