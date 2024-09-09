import java.util.ArrayList;

public class Logger {
private static Logger reference  = null;
private static int currentMessage =0;
private ArrayList<String> ar = new ArrayList<String>();
 public static Logger getInstance() {
	if(Logger.reference == null) {
		Logger.reference = new Logger();
	}
	return reference;
}
 public void log(String message) {
	Logger.currentMessage++;
	this.ar.add(message);
//	System.out.println(this.ar.get(Logger.currentMessage -1));
 }
 public String getLog() {
	 if(ar.size()> 0) {
		 String str = this.ar.get(Logger.currentMessage -1 );
		 return str;
	 }
	 else {
		 return "There is no Log Present";
	 }
 }
 public void clearLog() {
	 Logger.currentMessage = 0;
	 this.ar.clear();
 }
}
