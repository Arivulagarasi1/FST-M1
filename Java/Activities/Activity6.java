package activities;

import java.util.*;

public class Activity6 {

	public static void main(String[] args)throws Exception{
		
		Plane spiceJet=new Plane(10);
		spiceJet.onboard("ABC");
		spiceJet.onboard("XYZ");
		
		System.out.println("SpiceJet takes off at: "+spiceJet.takeOff());
		System.out.println("Passengers who onborded:"+spiceJet.getPassesngers());
		Thread.sleep(5000);
		spiceJet.land();
		System.out.println("spiceJet Landet at: "+spiceJet.getLastTimeLanded());

	}
}
	
	class Plane{
		public List<String> passengers;
	    public int maxPassengers;
	    public Date lastTimeTookOf;
	    public Date lastTimeLanded;
		
		Plane(int maxPassengers){
			this.maxPassengers=maxPassengers;
			this.passengers=new ArrayList();	
		}
		
		public void onboard(String passenger) {
			this.passengers.add(passenger);
		}
		public Date takeOff() {
			lastTimeTookOf=new Date();
			return lastTimeTookOf;
		}
		public void land() {
			lastTimeLanded=new Date();
			this.passengers.clear();
		}
		public Date getLastTimeLanded() {
			return lastTimeLanded;
		}
		public List<String> getPassesngers() {
			return passengers;
		}
	}	
