/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusReservationSystem;
public class bus {
    private int busno;
    private boolean ac;
    private int capacity;
    //constructor 
    bus(int no,boolean ac,int cap){
        this.busno = no;
        this.ac = ac;
        this.capacity = cap;
    }
    //accessor method
    public int getMethod(){ 
        return capacity;
    }
    public int getBusno(){ 
        return busno;
    }
    
    //mutator method
    public void setmethod(int cap){ 
        capacity=cap;
    }
    //display bus_info one by one
    public void dispBusInfo(){
        System.out.println("Bus No: " + busno + "- Ac: " + ac + "- Total Capacity: " + capacity);
    }
    
}
