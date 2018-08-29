package com.capgemini.day5;

import com.capgemini.day5.exceptions.InvalidDayException;
import com.capgemini.day5.exceptions.InvalidMonthException;

public class MyDate {
	private int date;
	private int month;
	private int year;

	public MyDate(int date,int month,int year) throws InvalidDayException, InvalidMonthException {
		
		if(date<1   ||  ((month==2)  &&  (year%4==0) && (date>29)) || ((month==2)  &&  (year%4!=0) && (date>28)) || 
				((month==01||month==03||month==5||month==7||month==8||month==10||month==12)&&(date>31)) ||(date>30))
			throw new InvalidDayException(("Date is invalid"));
			
		if(month<1 || month>12)
			throw new InvalidMonthException("Month is invalid");
		this.date=date;
		this.month=month;
		this.year=year;
	}

}
