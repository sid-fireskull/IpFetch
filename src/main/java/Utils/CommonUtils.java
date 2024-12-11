package Utils;

import java.util.Arrays;
import java.util.List;

public class CommonUtils {

	public static List<String> generateDemoIps()
	{
		String[] ips = {"192.168.0.1", "192.168.100.1", "172.150.0.1", "132.148.0.1", "192.99.0.7", "10.148.70.1"};
		return Arrays.asList(ips);
	}
	
	public static List<String> generateDemoDomains()
	{
		String[] domains = {"www.google.com", "www.yahoo.com", "www.flipkart.com", "www.netflix.com", "www.facebook.com", "www.github.com"};
		return Arrays.asList(domains);
	}
}
