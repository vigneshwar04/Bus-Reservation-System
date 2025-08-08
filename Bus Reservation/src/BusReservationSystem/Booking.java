/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusReservationSystem;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class Booking {
    String passengerName;
    int busno;
    Date date;
    
    //constructor
    Booking(){
        //getting passenger details
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of passenger: ");
        passengerName=sc.next();
        System.out.println("Enter Bus No: ");
        busno=sc.nextInt();
        System.out.println("Enter date: dd-mm-yyyy ");
        //getting date as string
        String dateInput=sc.next();
        //convert string to date using SimpleDateFormat class 
        //class obj=new class(format); MM-month/mm-min
        SimpleDateFormat date1=new SimpleDateFormat("dd-MM-yyyy");
        try {
            //storing (string-dateinput) in (obj-date)
            date=date1.parse(dateInput);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<bus> buses){
        int c=0;
        for(bus b: buses){
            if(b.getBusno()==busno)
                c=b.getMethod();
        }
        int booked=0;
        for(Booking b:bookings){
            if(b.busno==busno && b.date.equals(date)){
                booked++;
            }
        }
        
        return booked<c;
    }
    
}
