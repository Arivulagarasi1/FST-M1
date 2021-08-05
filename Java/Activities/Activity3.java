package activities;

public class Activity3 {

	public static void main(String[] args) {
		
		double seconds=1000000000;
		
		double earthSeconds=31557600;
		double mercurySeconds=0.2408467;
		double venusSeconds=0.61519726;
		double marsSeconds=1.8808158;
		double jupiterSeconds=11.862615;
		double saturnSeconds=29.447498;
		double uranusSeconds=84.016846;
		double neptuneSeconds=164.79132;
		
		System.out.println("In Mercury age:"+seconds/(earthSeconds*mercurySeconds));
		System.out.println("In Earth age:"+seconds/earthSeconds);
		System.out.println("In Venus age:"+seconds/(earthSeconds*venusSeconds));
		System.out.println("In Mars age:"+seconds/(earthSeconds*marsSeconds));
		System.out.println("In Jupiter age:"+seconds/(earthSeconds*jupiterSeconds));
		System.out.println("In Saturn age:"+seconds/(earthSeconds*saturnSeconds));
		System.out.println("In Uranus age:"+seconds/(earthSeconds*uranusSeconds));
		System.out.println("In Neptune age:"+seconds/(earthSeconds*neptuneSeconds));
		
	}

}
