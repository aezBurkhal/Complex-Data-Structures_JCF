import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {
//store data temporarily in memory

	public static String[] vehicles = { "ambulance", "helicopter", "lifeboat" };

	public static String[][] drivers = { { "Fred", "Sue", "Pete" }, { "Sue", "Richard", "Bob", "Fred" },
			{ "Pete", "Mary", "Bob" }, };

	public static void main(String[] args) {

		Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();

		// iterate through arrays
		for (int i = 0; i < vehicles.length; i++) {
			String vehicle = vehicles[i];
			String[] driverList = drivers[i];

			Set<String> driverSet = new LinkedHashSet<String>();

			for (String driver : driverList) {
				driverSet.add(driver);

			}

			personnel.put(vehicle, driverSet);
		}
		{
		//Brackets just to scope driverList variable so can use again later
			// Example usage
			Set<String> driverList = personnel.get("helicopter");

			for (String driver : driverList) {
				System.out.println(driver);
			}	

		}

		// Iterate through whole thing
		for (

		String vehicle : personnel.keySet()) {
			Set<String> driverSet = new LinkedHashSet<String>();
			
			System.out.print(vehicle);
			System.out.print(": ");
			Set<String> driverList = personnel.get(vehicle);
			
			for (String driver : driverList) {
				System.out.print(driver);
				System.out.print(" ");

			}
			System.out.println();
		}
	}
}
