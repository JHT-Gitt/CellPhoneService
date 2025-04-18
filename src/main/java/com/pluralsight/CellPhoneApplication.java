package com.pluralsight;
import java.util.*;


public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


     //   CellPhone cellnew = new CellPhone(0, "x", "x", "000-000-0000", "K");
        CellPhone cell1 = new CellPhone(0,"","","","");

        cell1.setSerialNumber(111);
        cell1.setModel("XYZ");
        cell1.setCarrier("T-Mobile");
        cell1.setPhoneNumber("111-111-1111");
        cell1.setOwner("Mark");
//        System.out.print("What is the serial number? : ");
//        int phoneSnumber = scan.nextInt();
//        cellnew.setSerialNumber(phoneSnumber);
//        System.out.print("What model is the phone? : ");
//        String phoneModel = scan.next();
//        cellnew.setModel(phoneModel);
//        System.out.printf("Who is the carrier? : ");
//        String phoneCarrier = scan.next();
//        cellnew.setCarrier(phoneCarrier);
//        System.out.print("What is the phone number? : ");
//        String phoneNumber = scan.next();
//        cellnew.setPhoneNumber( phoneNumber);
//        System.out.print("Who is the owner of the phone: ? ");
//        String phoneOwner = scan.next();
//        cellnew.setOwner(phoneOwner);
//
//        System.out.println("\nPhone Serial Number : " + cellnew.getSerialNumber() );
//        System.out.println("Phone Model : " + cellnew.getModel());
//        System.out.println("Phone Carrier : " + cellnew.getCarrier());
//        System.out.println("Phone Number : " + cellnew.getPhoneNumber());
//        System.out.println("Phone Owner : " + cellnew.getOwner() + "\n");
//
        CellPhone cell2 = new CellPhone(0,"", "", "","");

        cell2.setSerialNumber(222);
        cell2.setModel("ABC");
        cell2.setCarrier("Verizon");
        cell2.setPhoneNumber("222-222-1111");
        cell2.setOwner("Jacob");

       // cell1.dial(cell1.getOwner(),"855-888-5555");

        display(cell1);
        display(cell2);

        cell1.dial(cell2.getPhoneNumber());
        cell2.dial(cell1.getPhoneNumber());


        CellPhone cell3 = new CellPhone();
        cell3.setSerialNumber(333);
        cell3.setModel("DDD");
        cell3.setCarrier("AT&T");
        cell3.setPhoneNumber("333-333-3333");
        cell3.setOwner("Cath");

       // display(cell3);

        cell3.dial(cell1.getPhoneNumber());
        cell3.dial(cell3);

    }
    public static void display(CellPhone phone) {

        System.out.println("\nPhone Serial number: " + phone.getSerialNumber());
        System.out.println("Phone Model: " + phone.getModel());
        System.out.println("Phone Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Phone Owner: " + phone.getOwner() +"\n");

    }
}
