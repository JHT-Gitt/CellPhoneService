package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String model, carrier, phoneNumber, owner;


    public CellPhone( int serialNumber, String model, String carrier , String phoneNumber, String owner) {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }
    public CellPhone(int serialNumber){
            this.serialNumber = serialNumber;
    }
    public CellPhone(int serialNumber, String model){
        this.serialNumber = serialNumber;
            this.model = model;
    }
    public CellPhone(int serialNumber, String model, String carrier){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
    }
    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
    }
public CellPhone(){

}
//    public CellPhone() {
//        this.serialNumber = 0;
//        this.model = "xyz";
//        this.carrier = "verizon";
//        this.phoneNumber = "000-000-0007";
//        this.owner = "J";
//    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void dial(String _phoneNumber){
        System.out.println(this.owner + "'s phone is calling " + _phoneNumber);
    }
    public void dial(CellPhone phone){
        System.out.println("\nPhone Serial number: " + phone.getSerialNumber());
        System.out.println("Phone Model: " + phone.getModel());
        System.out.println("Phone Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Phone Owner: " + phone.getOwner() +"\n");
    }



}
