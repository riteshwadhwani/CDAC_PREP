package Array_question_9;

import java.util.Scanner;

public class AeroplaneSeatAssigner {
	private Scanner sc = new Scanner(System.in);
	private int[][] arr ;
	
	AeroplaneSeatAssigner(){
		this(6,4);
	}
	AeroplaneSeatAssigner(int row,int seat){
		arr = new int[row][seat];
	}
	public void bookSeat() {
		System.out.println("Enter the row no ");
		int row = sc.nextInt()-1;
		System.out.println("Enter the seat no.");
		int seat = sc.nextInt()-1;
		if(seat > this.arr[0].length || row >this.arr.length) {
			System.out.println("Invalid seat No.");
		}
		else if(this.arr[row][seat]!=-1) {
			this.arr[row][seat] = -1;
			System.out.println("Seat Assgined!!");
		}
		else {
			System.out.println("This seat is already Booked!!");
		}
	}
	public void cancelBooking() {
		System.out.println("Enter the row no ");
		int row = sc.nextInt()-1;
		System.out.println("Enter the seat no.");
		int seat = sc.nextInt()-1;
		if(this.arr[row][seat]==-1) {
			this.arr[row][seat] = 0;
			System.out.println("Booking Cancelled!!");
		}
		else {
			System.out.println("fistly book the seat to cancel booking.");
		}
	}
	public void seatAvailable() {
		System.out.println("In which row your want Seat");
		int row = sc.nextInt()-1;
		System.out.println("which seat you want");
		int seat = sc.nextInt()-1;
		if(seat > this.arr[0].length || row >this.arr.length) {
			System.out.println("Invalid seat No.");
		}
		else {
			if(this.arr[row][seat] == -1) {
				System.out.println("Not Available!!");
			}
			else {
				System.out.println("Available..!!");
			}
		}
	}
	public void currentSeatChart() {
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				if(arr[i][j]==0) {
					System.out.print(" Unbooked!!" + " |");
				}
				else {
					System.out.print(" Booked!!" + " |");
				}
			}
			System.out.println();
		}
	}
	
}
