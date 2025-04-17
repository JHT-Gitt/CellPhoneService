package com.pluralsight;
import java.util.*;


public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        CellPhone cellnew = new CellPhone();

        System.out.print("What is the serial number? : ");
        int phoneSnumber = scan.nextInt();
        cellnew.setSerialNumber(phoneSnumber);
        System.out.print("What model is the phone? : ");
        String phoneModel = scan.next();
        cellnew.setModel(phoneModel);
        System.out.print("Who is the carrier? : ");
        String phoneCarrier = scan.next();
        cellnew.setCarrier(phoneCarrier);
        System.out.print("What is the phone number? : ");
        String phoneNumber = scan.next();
        cellnew.setPhoneNumber( phoneNumber);
        System.out.print("Who is the owner of the phone: ? ");
        String phoneOwner = scan.next();
        cellnew.setOwner(phoneOwner);

        System.out.println("\nPhone Serial Number : " + cellnew.getSerialNumber() );
        System.out.println("Phone Model : " + cellnew.getModel());
        System.out.println("Phone Carrier : " + cellnew.getCarrier());
        System.out.println("Phone Number : " + cellnew.getPhoneNumber());
        System.out.println("Phone Owner : " + cellnew.getOwner());



    }
}
