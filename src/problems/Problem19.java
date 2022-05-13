// Problem: 19
// Status: Done
// Last Modified: Fri, 25 Nov, 2016
// Author: Abdullah Leghari


package problems;
import org.joda.time.*;

public class Problem19 {

	public static void main(String[] args) {
		
		DateTime startDate = DateTime.parse("1901-01-01");
        DateTime endDate = DateTime.parse("2000-12-31");

        int result = startDate.compareTo(endDate);
        
        int sundays = 0;

        while (result < 0)
        {
            if(startDate.getDayOfMonth() == 1)
            {
                if(startDate.getDayOfWeek() == 1)
                {
                    System.out.println(startDate);
                    sundays ++;
                }
            }

            startDate = startDate.plusDays(1);
            
        }
        System.out.println(sundays);
        
        
		/*
		Calendar cal = Calendar.getInstance();
		
		cal.set(1900, 01,51);
		
		
		//cal.setTime(from);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(day);
		
		
	*/
		
		/*
		 *    DateTime startDate = DateTime.Parse("01/01/1901");
            DateTime endDate = DateTime.Parse("12/31/2000");

            
            int sundays = 0;

            while (startDate <= endDate)
            {
                if(startDate.Day == 1)
                {
                    if(startDate.DayOfWeek.ToString() == "Sunday")
                    {
                        Console.WriteLine(startDate);
                        sundays ++;
                    }
                }

                startDate = startDate.AddDays(1.0);
                
            }
            Console.WriteLine(sundays);
            Console.ReadLine();
		*/
		
		//System.out.println("Answer is 171, solved using C#");
	}

}
