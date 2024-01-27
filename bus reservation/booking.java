package BusReservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class booking {
String passengerName;
static int busno;
 static Date date;

booking(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter name of the passenger : ");
	passengerName = scanner.next();
	System.out.println("Enter Bus no : ");
	busno = scanner.nextInt();
	System.out.println("enter date dd-mm-yyyy");
	String dateInput = scanner.next();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	
	try {
		date = dateFormat.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static boolean isAvailable(ArrayList<booking>bookings , ArrayList<bus>buses) {
	int capacity = 0;
	for(bus bu:buses) {
		if(bu.getBusno()== busno)
			capacity = bu.getCapacity();
	}
	
	int booked =0;
	for (booking b:bookings) {
		if(b.busno == busno && b.date.equals(date)) {
		booked++;	
		}
	}
	return booked<capacity?true:false;
}
}
