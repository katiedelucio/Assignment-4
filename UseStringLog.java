
public class UseStringLog {
	
	public static void main (String []args) {
StringLogInterface log;
log = new ArrayStringLog ("Example Use");//could use LinkedStringLog too

log.insert("Elvis");
log.insert("Elvis");
log.insert("Elvis");
log.insert("Elvis");
log.insert("Elvis");
log.insert("King Louis XII");
log.insert("Captain Kirk");
log.delete("Elvis");

System.out.println(log);
System.out.println("The size of the log is " + log.size());
System.out.println("Elvis is in the log: " + log.contains("Elvis"));
System.out.println("Santa is in the log: " + log.contains("Santa"));
System.out.println("Is the log empty: " + ((ArrayStringLog) log).isEmpty());
System.out.println("How many times does the element appear in log: " + ((ArrayStringLog) log).howMany("Elvis"));
System.out.println("Is the requested element unique to log: " + ((ArrayStringLog) log).uniqInsert("Jeff"));
System.out.println("Is the requested element unique to log: " + ((ArrayStringLog) log).uniqInsert("jeff"));
System.out.println("Is the requested element unique to log: " + ((ArrayStringLog) log).uniqInsert("elvis"));
System.out.println(log);
System.out.println("How many of the element were deleted: " + ((ArrayStringLog) log).deleteAll("Elvis"));
System.out.println(log);








}
}