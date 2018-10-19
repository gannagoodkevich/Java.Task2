
public class Date {
public static int leapYearCheck(int c) {
	int flag=0;
	if(c%4==0) {
		flag = 1;
		if(c%100==0) {
			if(c%400!=0) {
				flag=0;
			}
		}
		else {
			flag=0;
		}
	}
	return flag;
}
public static DateAns nextDay(int a, int b, int c) {
	b--;
	DateAns date = new DateAns();
	int Month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	if(leapYearCheck(c)==1) {
		Month[1]=29;
	}
	if(Month[11]==a) {
		date.a=1;
		date.b=0;
		date.c=c+1;
	}
	else {
	date.c=c;
	if(Month[b]==a) {
		date.a=1;
		date.b=b+1;
	}
	else {
		date.a=a+1;
		date.b=b;
	}	
	}
	date.b++; 
	return date;
}
}

class DateAns{
	public int a;
	public int b;
	public int c;
}
