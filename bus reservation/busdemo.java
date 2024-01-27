package BusReservation;

import java.util.Scanner;
import java.util.ArrayList;
public class busdemo {
	
public static void main (String[] args) {
	
	ArrayList<bus> buses = new ArrayList<bus>();
	ArrayList<booking>bookings = new ArrayList<booking>();
	
	buses.add(new bus(1 , true , 1));
	buses.add(new bus(2 , true , 45));
	buses.add(new bus(3 , false , 48));
	buses.add(new bus(4 , true , 44));
	buses.add(new bus(5 , true , 40));
	
	int userOpt =1;
	Scanner scanner=new Scanner(System.in);
	
	for(bus b:buses) {
		b.displayBusInfo();
	}
	
	while(userOpt==1) {
		System.out.println("enter 1 to book and 2 to exit");
		userOpt = scanner.nextInt();
		if(userOpt ==1) {
			booking book = new booking();
			if (booking.isAvailable(bookings,buses)) {
				bookings.add(book);
				System.out.println("Your booking is confirm");
			}
			else
				System.out.println("sorry . Bus is full . check for other date/bus");
		}
	}
}
}
