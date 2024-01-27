package BusReservation;

public class bus {
private int busno;
private boolean ac;
private int capacity;

bus(int no  , boolean ac  ,int cap){
	this.busno =no;
	this.ac= ac;
	this.capacity=cap;
}
public int getCapacity(){
	return capacity;
}
public boolean isAc() {
	return ac;
}
public int getBusno() {
	return busno;
}
public void setAc(boolean val) {
	ac = val;
}
public void setcapacity(int cap) {
	capacity = cap;
}
public void displayBusInfo() {
	System.out.println("bus no :" +busno + "Ac :"+ ac + "Total Capacity : "+ capacity );
}
}
