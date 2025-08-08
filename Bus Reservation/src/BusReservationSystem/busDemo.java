/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusReservationSystem;
import java.util.Scanner;
import java.util.ArrayList;

public class busDemo {
    public static void main(String[] args){
    //create_arrayList named buses consits of bus_objects
        ArrayList<bus> buses=new ArrayList<>();
    //create_arrayList named buses consits of bus_objects
        ArrayList<Booking> bookings=new ArrayList<>();
    
        //create & adding bus_obj in arraylist
        buses.add(new bus(1,true,1));
        buses.add(new bus(2,false,50));
        buses.add(new bus(3,true,95));
        
        Scanner sc=new Scanner(System.in);
        int user_choice=1;
        
        for(bus b : buses){
            b.dispBusInfo();
        }
        
        while(user_choice==1){
            System.out.println("Enter 1 to book & 2 to exit");
            user_choice=sc.nextInt();
            if(user_choice==1){
                Booking booking=new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your Booking is confirmed");
                }
                else{
                    System.out.println("Sorry! Bus is full");
                    
                }
            }
        }
    }    
}
