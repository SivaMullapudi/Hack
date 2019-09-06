package com.infy.SpringApplication;

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        long test = Long.parseLong(s.nextLine());
        for(long i=0;i<test;i++)
        {
            long t = Long.parseLong(s.nextLine());
             System.out.println(minimumSumBeauty(t));
        }
    }
    public static long beauty(long number)
	    {
		    long beat=0;
		    while(number>0)
		    {
			    beat+=(number&1);
			    number=number/2;
		    }
		    return beat;
	    }
	    public static long minimumSumBeauty(long number)
	    {
	        long sum=0;
	        long min=0;
	        for(long i=1;i<=number;i++)
	        {
	            sum=sum+beauty(i);
	            if(sum>=number)
	            {
	                min=i;
	                break;
	            }
	        }
	        return min;
	    }
}

