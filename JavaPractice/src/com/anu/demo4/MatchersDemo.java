package com.anu.demo4;

import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchersDemo {
	private String IPV4_REGEX = "^(?:(?:^|\\.)(?:2(?:5[0-5]|[0-4]\\d)|1?\\d?\\d)){4}$";
	
	public static void main(String[] args) {
		MatchersDemo m = new MatchersDemo();
		List<String> arr = new ArrayList<String>();
		arr.add("1.2.3.4.5");
		arr.add("1.ew.4.5");
		arr.add("185.73.14.5");
		arr.add("256.78.4.5");
		arr.add("9.3.4.5");
		arr.add("3.4.5");
		arr.add("3.#.5.66");
		//arr.add(null);
		
		/*for (String ipAddress : arr) {
			System.out.println( ipAddress +" valid ip : " + m.isIPv4(ipAddress));
		}*/

		int count =0 ;
        try{
            while (count++ < 10)
            {
                if (count > 1)
                {
                	System.out.println(" count is : " +count);
                    break;
                }
                else
                {
                    Thread.sleep(50);
                }
                System.out.println("inside the while loop : "+ count);
            }
        }
        catch (final Exception exc)
        {
            exc.printStackTrace();
        }
	}

	private boolean isIPv4(String ip) {
		final Pattern pattern = Pattern.compile(IPV4_REGEX);
		final Matcher matcher = pattern.matcher(ip);
		//return matcher.matches();
		
		return ip.matches(
                "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                        + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                        + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                        + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
	}
	
	
	
	

}
