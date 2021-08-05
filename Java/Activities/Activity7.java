package activities;

public class Activity7 {

	public static void main(String[] args) {
		MountainBike Bike=new MountainBike(2,0,8);
		Bike.SpeedUp(4);
		Bike.applyBrake(2);
		Bike.setHeight(12);
		System.out.println(Bike.bicycleDesc());
		Bicycle b=new Bicycle(4,0);
		System.out.println(b.bicycleDesc());
	}

}

interface BicycleParts
{
	 public int gears=0;
	 public int currentSpeed=0;
}

interface BicycleOperations
{
	 public void applyBrake(int decrement);
	 public void SpeedUp(int increment);
	 
}

class Bicycle implements BicycleParts,BicycleOperations 
{
	public int gears;
	public int currentSpeed;
	
	public Bicycle(int gears, int currentSpeed)
	{
		this.gears=gears;
		this.currentSpeed=currentSpeed;
	}
	
	public void applyBrake(int decrement) {
		System.out.println(currentSpeed-=decrement);
	}
	 
	public void SpeedUp(int increment) {
		System.out.println(currentSpeed+=increment);
	}
	
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	}
}
class MountainBike extends Bicycle{
	 public int seatHeight;
	public MountainBike(int gears,int currentSpeed,int seatHeight){
		 super(gears,currentSpeed);
		//super.gears=gears;
		//super.currentSpeed=currentSpeed;
		 this.seatHeight=seatHeight;
	 }
	 public void setHeight(int newValue) { 
		   seatHeight = newValue;
		}
	 
	 public String bicycleDesc() {
		    return(super.bicycleDesc() + "\nSeat Height :"+seatHeight);
		}
}

