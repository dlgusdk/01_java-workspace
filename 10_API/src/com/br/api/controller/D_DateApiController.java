package com.br.api.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class D_DateApiController {
/*
 * Date, LocalDate, Calendar...
 * 
 * 
 */
	
	public void utilDateTest() {
		/*
		 * Date(java.util)
		 * -날짜 및 시간에 대한 값을 담을 수 있는 객체
		 * -자바 초장기에 개발되어 다국적으로 쓰기에는 적합하지 않음
		 *  대부분이 deprecated되어있음(언젠가는 사라질 것)		 * 
		 */
		
		Date date1 = new Date(); //기본생성자로 생성(현재 날짜 및 시간)
		System.out.println(date1/*.toString()*/);
		
		//내가 원하는 날짜 및 시간으로 세팅하려면
		//2022년 5월 4일로 세팅
		//1.setter메소드
		date1.setYear(2022 - 1900);
		date1.setMonth(5 - 1);
		date1.setDate(4);
		
		System.out.println(date1);
		
		//2.매개변수 생성자로 생성
		Date date2 = new Date(2022-1900, 5-1, 4);
		System.out.println(date2);
		
		//get ~ 메소드
		System.out.println(date2.getYear() + 1900);
		System.out.println(date2.getMonth() +1);
		System.out.println(date2.getDate());
		System.out.println(date2.getDay());
		
	
	}
	
	public void calenderTest1() {
		/*
		 * 국가별, 시간대별로 정확히 알 수 있게 제공 -> java.util.Calender
		 */
		
		//Calendar cal = new Calendar(); 생성 불가능, abstract클래스라서 불가
		Calendar cal = Calendar.getInstance();
		//Calendar ca1 = new GregorianCalendar();
		System.out.println(cal);
		/*
		 * Calender를 상속받는 GregorianCalender 클래스 객체가 필요함 (우리나라)
		 */
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+ 1; //월은 1월(0)부터 시작 +1해줘야함
		int date = cal.get(Calendar.DATE);
		int ampm = cal.get(Calendar.AM_PM); //AM이면 0 /PM이면 1
		int hour = cal.get(Calendar.HOUR);
		int hour24 = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 %s %d(%d)시 %d분 %d초\n", 
							year, month, date,
							ampm==0 ? "오전" : "오후",
						    hour, hour24, min, sec);
		
	}
	
	public void calenderTest2() {
		//내가 원하는 날짜 및 시간으로 설정
		//방법 1.현재 날짜 및 시간으로 생성 한 후 set으로 수정
		Calendar date1 = Calendar.getInstance();
		//2024년 6월 11일
		date1.set(Calendar.YEAR, 0);
		date1.set(Calendar.MONTH, Calendar.JUNE); //6월은 5. 0부터 시작. 6월에 해당하는 필드 JUNE. 그러므로 6월을 정상적으로 출력하려면 5를 매핑해줘야함.출력에서 +1을 해서 6을 만들어야 6월이 정상출력된다. 
		date1.set(Calendar.DATE, 11);
		date1.set(Calendar.HOUR,6);
		date1.set(Calendar.HOUR_OF_DAY, 18);

		
		//방법2.생성할때 세팅
		date1 = new GregorianCalendar(2024, 6-1, 11, 15, 30, 10);

		System.out.printf("%d년 %d월 %d일 %d(%d)시 : %d : %d\n", 
				date1.get(Calendar.YEAR),
				date1.get(Calendar.MONTH)+1,
				date1.get(Calendar.DATE),
				date1.get(Calendar.HOUR),
				date1.get(Calendar.HOUR_OF_DAY),
				date1.get(Calendar.MINUTE),
				date1.get(Calendar.SECOND));
		
	}
	
	public void calenderDate() {
		//java.util.Calender객체 ->java.util.Date객체
		
		Calendar cal = new GregorianCalendar(2024, 6-1, 11);
		System.out.println(cal);
		System.out.println(cal.getTimeInMillis());
	
		Date date = new Date(cal.getTimeInMillis());
		System.out.println(date);
	
		// 한줄로 표현하기 
		Date date2 = new Date(new GregorianCalendar(2024, 3-1, 11).getTimeInMillis());
	}

		//java8 이상
		//LocalDate, LocalTime,LOcalDateTime
	public void localDateTest() {
		//static 메소드인 now호출시켜서 생성
		//LocalDate date = LocalDate.now(); //현재날짜
		
		//날짜지정
		LocalDate date = LocalDate.of(2024, 6, 11);	
		 
		System.out.println(date);
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfMonth());
		
	}
	
	public void localTimeTest() {
		
		LocalTime time = LocalTime.now(); //현재시간
		
		//LocalDate time = LocalDate.of(13,35,20);	//시간지정

		System.out.println(time.toString());
		System.out.println(time.toString().substring(0,8));
	
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
	}

	public void localDateTimeTest() {
		//LocalDate + LocalTime -> LocalDateTime
	
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime); //년-월-일T시:분:초.나노초
		
		//LocalDate의 getXXX 메소드 이용가능
		//LocalTime의 getXXX 메소드 이용가능
	
		LocalDateTime dateTime2 = LocalDateTime.of(2024, 6, 11, 12, 30, 5);	//시간지정
		System.out.println(dateTime2.toString().replace("T", " "));
	}
	
	//(중요!)날짜 및 시간에 대한 객체를 내가 운하는 형식의 문자열로 처리하는 방법
	public void dateToString() {
		//java.text.SimpleDateFormat
		
		/*SimpleDateFormat
		 * SimpleDateFormat sdf = new SimpleDateFormat("반영시키고자하는 출력형식(포맷)");
		 * sdf.format(날짜객체) : String
		 * 
		 * y : 년
		 * M : 월
		 * d : 일
		 * E : 요일
		 * h : 시
		 * m : 분
		 * s : 초
		 * 
		 */
		
		//2024년 01월 04일 15:31:30 
		//1.java.util.Date객체가지고 반영
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E hh:mm:ss"); //대문자 H로 쓰면 24시간 기준으로 볼 수 있음
		String dateStr = sdf.format(new Date()); 
		System.out.println(dateStr);
		
		//2.java.util.Calender반영
		sdf = new SimpleDateFormat("yyyy/MM/dd/ HH:mm");
		
		//>Calendar 객체는 바로 전달하면 안됨
		//String calStr = sdf.format(Calendar.getInstance()); 
		String calStr = sdf.format(Calendar.getInstance().getTimeInMillis());
		System.out.println(calStr);
		
	}
}
