
public class InstanceCounter {
private static int noOfInstance ;
InstanceCounter(){
	InstanceCounter.noOfInstance++;
}
public static int getCounter() {
	return InstanceCounter.noOfInstance;
}
}
