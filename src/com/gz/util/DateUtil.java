package com.gz.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtil {

	public final static String DEFAULT_PATTERN = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 返回当前日期时间
	 * 
	 * @return 例如：2006-06-06 12:12:50
	 */
	public static String getCurDateTime() {
		return getCurDateTime(DEFAULT_PATTERN);
	}

	/**
	 * 根据给定的格式返回当前日期或时间 相当于调用getDateTime(formatStr,Calendar.getInstance()
	 * 
	 * @param formatStr
	 *            日期时间格式 例如：yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getCurDateTime(String formatStr) {
		return getDateTime(formatStr, Calendar.getInstance());
	}

	/**
	 * 根据给定的格式、Calendar返回相应字符串
	 * 
	 * @param formatStr
	 *            日期时间格式 例如：yyyy-MM-dd HH:mm:ss
	 * @param c
	 *            Calendar实例
	 * @return
	 */
	public static String getDateTime(String formatStr, Calendar c) {
		SimpleDateFormat nowDate = new SimpleDateFormat(formatStr);
		String curTimeStr = nowDate.format(c.getTime());

		return curTimeStr;
	}

	/**
	 * 把已经格式好的美国日期转换成指定格式的中国日期
	 * 
	 * @param usFormattedString
	 *            已经格式好的美国日期 例如"02 May 2007"
	 * @param originalPattern
	 *            原始美国日期格式格式 例如"dd MMMMM yyyy"
	 * @param newPattern
	 *            要转换成的中国日期格式 例如"yyyy-MM-dd"
	 * @return 转换后的中国日期格式，如果解析异常即返回原美国日期 此例返回"2007-05-02"
	 */
	public static String usFormat2Ch(String usFormattedString,
			String originalPattern, String newPattern) {
		SimpleDateFormat chFormat = new SimpleDateFormat(newPattern,
				Locale.CHINA);
		SimpleDateFormat usFormat = new SimpleDateFormat(originalPattern,
				Locale.US);
		String convertedString;
		try {
			Date d = usFormat.parse(usFormattedString);
			convertedString = chFormat.format(d);
		} catch (ParseException e) {
			convertedString = usFormattedString;
		}
		return convertedString;
	}

	/**
	 * 把给定的日期字符串解析成对应的Calendar对象
	 * 
	 * @param dateTimeString
	 *            "2007-07-25 12:35:01"
	 * @return
	 */
	public static Calendar parse(String dateTimeString) {
		DateFormat df = new SimpleDateFormat(DEFAULT_PATTERN);
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(df.parse(dateTimeString));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return c;
	}
	
	public static Calendar parse(String dateTimeString,String format) {
		DateFormat df = new SimpleDateFormat(format);
		Calendar c = Calendar.getInstance();
		try {
			c.setTime(df.parse(dateTimeString));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return c;
	}

	/**
	 * 两个日期之差
	 * 
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	public static long dateDays(String date1, String date2) throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		long myTime, myTime2, days = 0;
		Date aDate2, aDate;
		try {
			aDate = formatter.parse(date1);// 任意日期，包括当前日期
			myTime = (aDate.getTime() / 1000);

			aDate2 = formatter.parse(date2);// 任意日期，包括当前日期
			myTime2 = (aDate2.getTime() / 1000);

			if (myTime > myTime2) {
				days = (myTime - myTime2) / (60 * 60 * 24);
			} else {
				days = (myTime2 - myTime) / (60 * 60 * 24);
			}
		} catch (Exception e) {
//			e.printStackTrace();
			throw e;
		}

		return days;

	}

	/**
	 * 返回前天的日期字符串(当前是2007年3月27日，将返回2007-03-25)
	 * 
	 * @return
	 */
	public static String getDayBeforeYesterday() {
		return getBeforeToday(2);
	}

	/**
	 * 返回今天之前几天的日期字符串(当前是2007年3月27日，nDays=5,将返回2007-03-22)
	 * 
	 * @param nDays
	 *            前几天(不大于365,不小于0)
	 * @return
	 */
	public static String getBeforeToday(int nDays) {
		if (nDays < 0) {
			nDays = 0;
		}
		if (nDays > 365) {
			nDays = 365;
		}
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_YEAR, c.get(Calendar.DAY_OF_YEAR) - nDays);
		SimpleDateFormat nowDate = new SimpleDateFormat("yyyy-MM-dd");
		String timeStr = nowDate.format(c.getTime());

		return timeStr;
	}
	
	/**
	 * 返回今天之前几天的日期字符串(当前是2007年3月27日，nDays=5,将返回2007-03-22)
	 * 
	 * @param nDays
	 *            前几天(不大于365,不小于0)
	 * @return
	 */
	public static String getBeforeToday(int month, int nDays) {
		if (month < 1 ) {
			month = 1;
		}
		if (month > 12 ) {
			month = 12;
		}
		if (nDays < 0) {
			nDays = 0;
		}
		if (nDays > 365) {
			nDays = 365;
		}
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.DAY_OF_MONTH, nDays);
		SimpleDateFormat nowDate = new SimpleDateFormat("yyyy-MM-dd");
		String timeStr = nowDate.format(c.getTime());
		return timeStr;
	}
	
	/**
	 * 返回今天之前几天的日期字符串(当前是2007年3月27日，nDays=5,将返回2007-03-22)
	 * 
	 * @param nDays
	 *            前几天(不大于365,不小于0)
	 * @return
	 */
	public static String getBeforeToday(int year, int month, int nDays) {
		if (month < 1 ) {
			month = 1;
		}
		if (month > 12 ) {
			month = 12;
		}
		if (nDays < 0) {
			nDays = 0;
		}
		if (nDays > 365) {
			nDays = 365;
		}
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.DAY_OF_MONTH, nDays);
		SimpleDateFormat nowDate = new SimpleDateFormat("yyyy-MM-dd");
		String timeStr = nowDate.format(c.getTime());
		return timeStr;
	}
	
	/**
	 * 返回今天之前几小时的日期字符串(当前是2007年3月27日 11:23:34，nhours=5,将返回2007-03-22 11:23:34)
	 * 
	 * @param nhours
	 *            前几小时(不大于365,不小于0)
	 * @return
	 */
	public static String getBeforeDate(int nhours) {
		if (nhours < 0) {
			nhours = 0;
		}
		Calendar c = Calendar.getInstance();
		///c.set(Calendar.DAY_OF_YEAR, c.get(Calendar.DAY_OF_YEAR) - nDays);
		c.set(Calendar.HOUR_OF_DAY, c.get(Calendar.HOUR_OF_DAY) - nhours);
		SimpleDateFormat nowDate = new SimpleDateFormat(DEFAULT_PATTERN);
		String timeStr = nowDate.format(c.getTime());

		return timeStr;
	}
	
	/**
	 * 获取某月的第一天
	 * @param date
	 * @return 
	 */
	public static String getCurMonthFirstDay(int month) {
		Calendar c = Calendar.getInstance();
		// 小于1情况下返回当前月的第一天
		if (month < 1 || month > 12) {
			month = c.get(Calendar.MONTH) + 1;
		}
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.DAY_OF_MONTH, 1);
		SimpleDateFormat nowDate = new SimpleDateFormat("yyyy-MM-dd");
		String timeStr = nowDate.format(c.getTime());
		return timeStr;
	}
	
	/**
	 * 获取某月的最后一天或者当前月的前一天
	 * @param date
	 * @return 
	 */
	public static String getCurMonthLastDay(int month) {
		Calendar c = Calendar.getInstance();
		int curmonth = c.get(Calendar.MONTH) + 1;
		// 小于1情况下返回当前月的最后一天
		if (month < 1 || month > 12) {
			month = c.get(Calendar.MONTH) + 1;
		}
		if (curmonth == month) {
			// 查看是否是当月的第一天
			if (isFirstDayOfMonth()) {
				return getCurMonthFirstDay(month);
			}
			return getBeforeToday(1);
		}
		// 获取某月的下一个月的第一天-1
		c.set(Calendar.MONTH, month);
	//	c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		c.set(Calendar.DAY_OF_MONTH,0);
		SimpleDateFormat nowDate = new SimpleDateFormat("yyyy-MM-dd");
		String timeStr = nowDate.format(c.getTime());
		return timeStr;
	}
	
	/**
	 * 获取某月的第一天
	 * @param date
	 * @return 
	 */
	public static String getCurMonthFirstDay(int year, int month) {
		Calendar c = Calendar.getInstance();
		// 小于1情况下返回当前月的第一天
		if (month < 1 || month > 12) {
			month = c.get(Calendar.MONTH) + 1;
		}
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1);
		c.set(Calendar.DAY_OF_MONTH, 1);
		SimpleDateFormat nowDate = new SimpleDateFormat("yyyy-MM-dd");
		String timeStr = nowDate.format(c.getTime());
		return timeStr;
	}
	
	/**
	 * 获取某月的最后一天或者当前月的前一天
	 * @param date
	 * @return 
	 */
	public static String getCurMonthLastDay(int year, int month) {
		Calendar c = Calendar.getInstance();
		int curmonth = c.get(Calendar.MONTH) + 1;
		int curyear = c.get(Calendar.YEAR);
		// 小于1情况下返回当前月的最后一天
		if (month < 1 || month > 12) {
			month = c.get(Calendar.MONTH) + 1;
		}
		if (curmonth == month && year == curyear) {
			// 查看是否是当月的第一天
			if (isFirstDayOfMonth()) {
				return getCurMonthFirstDay(year, month);
			}
			return getBeforeToday(1);
		}
		// 获取某月的下一个月的第一天-1
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month);
	//	c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		c.set(Calendar.DAY_OF_MONTH,0);
		SimpleDateFormat nowDate = new SimpleDateFormat("yyyy-MM-dd");
		String timeStr = nowDate.format(c.getTime());
		return timeStr;
	}
	
	/**
	 * 返回某月的年月日期 格式200906
	 * @param month
	 * @return 
	 */
	public static String getYearMonth(int year, int month) {
		Calendar c = Calendar.getInstance();
		if (month < 1 || month > 12) {
			month = c.get(Calendar.MONTH) + 1;
		}
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month - 1);
		SimpleDateFormat nowDate = new SimpleDateFormat("yyyyMM");
		String timeStr = nowDate.format(c.getTime());
		return timeStr;
	}
	
	/**
	 * 返回某月的年月日期 格式200906
	 * @param month
	 * @return 
	 */
	public static String getYearMonth(int month) {
		Calendar c = Calendar.getInstance();
		if (month < 1 || month > 12) {
			month = c.get(Calendar.MONTH) + 1;
		}
		c.set(Calendar.MONTH, month - 1);
		SimpleDateFormat nowDate = new SimpleDateFormat("yyyyMM");
		String timeStr = nowDate.format(c.getTime());
		return timeStr;
	}

	
	/**
	 * 返回今天之前几天的日期字符串(当前是2007年3月27日，nDays=5,将返回2007-03-22)
	 * 
	 * @param nDays
	 *            前几天(不大于365,不小于0)
	 * @return
	 */
	public static String getBeforeToday(String date, int nDays) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;
		try {
			d = df.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		// if(nDays<0){
		// nDays = 0;
		// }
		if (nDays > 365) {
			nDays = 365;
		}
		c.set(Calendar.DAY_OF_YEAR, c.get(Calendar.DAY_OF_YEAR) - nDays);
		SimpleDateFormat nowDate = new SimpleDateFormat("yyyy-MM-dd");
		String timeStr = nowDate.format(c.getTime());

		return timeStr;
	}

	/**
	 * 是否为每月的第一天
	 * 
	 * @return true of false
	 */
	public static boolean isFirstDayOfMonth() {
		Calendar c = Calendar.getInstance();

		return c.get(Calendar.DAY_OF_MONTH) == 1;
	}

	/**
	 * 获取当前日是当前月的第几天
	 * 
	 * @return
	 */
	public static int getCurDayOfMonth() {
		return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 指定日期是所在月的第几天
	 * 
	 * @param date
	 *            格式"2008-08-08"
	 * @return
	 */
	public static int getDayOfMonth(String date) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;
		try {
			d = df.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		return c.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 返回当前年月的第一天第一秒的Date对象
	 * 
	 * @return
	 */
	public static Date getFirstSecondOfCurMonth() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);

		return c.getTime();
	}

	/**
	 * 返回明天的第一秒的Date对象
	 * 
	 * @return
	 */
	public static Date getFirstSecondOfTomorrow() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);

		return c.getTime();
	}

	/**
	 * 返回明天第一秒的毫秒值
	 * 
	 * @return
	 */
	// public static long tomorrowFirstSecondMillis(){
	// Calendar c = Calendar.getInstance();
	// c.add(Calendar.DAY_OF_MONTH,1);
	// c.set(Calendar.HOUR_OF_DAY,0);
	// c.set(Calendar.MINUTE,0);
	// c.set(Calendar.SECOND,0);
	// return c.getTimeInMillis();
	// }
	/**
	 * 获取明天指定钟点数0分0秒时的毫秒数
	 * 
	 * @param tomorrowHour
	 *            明天钟点数（5点etc.）
	 * @return
	 */
	public static long betweenTomorrowSecondMillis(int tomorrowHour) {
		if (tomorrowHour < 0) {
			tomorrowHour = 0;
		}
		if (tomorrowHour > 23) {
			tomorrowHour = 23;
		}

		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, tomorrowHour);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTimeInMillis();
	}

	/**
	 * 格式化日期时间字符串 如果长度不符就直接返回dateTimeString
	 * 
	 * @param dateTimeString
	 *            (070831123800)
	 * @return (07-08-31 12:38:00)
	 */
	public static String formatDateTime(String dateTimeString) {
		StringBuffer buffer = new StringBuffer(dateTimeString);
		if (buffer.length() != 12) {
			return dateTimeString;
		}
		for (int i = 1; i < 3; i++) {
			buffer.insert(12 - i * 2, ":");
		}
		buffer.insert(6, " ");// 设置日期与时间之间的连字符号
		for (int i = 1; i < 3; i++) {
			buffer.insert(6 - i * 2, "-");// 设置年、月、日之间的连字符号
		}
		return buffer.toString();
	}

	/**
	 * 格式化时间 去掉毫秒
	 * 
	 * @param date
	 * @return
	 */
	public static String parseDate(String date) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return df.format(df.parse(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * 截取字符串
	 * @param num
	 */
	public static String interceptStr(String num){
		
		int i=num.indexOf('.');
		
		int re=num.substring(0,i).length()+5;
		
		num=num.substring(0,re);
		
		return num;
		
	}
	
	/**
	 * 判断两个时间相差的时间
	 * @param interval 
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int dateDiff(String interval, java.util.Date date1,
			java.util.Date date2) {
		int intReturn = -1000000000;
		if (date1 == null || date2 == null || interval == null)
			return intReturn;
		try {
			java.util.Calendar cal1 = java.util.Calendar.getInstance();
			java.util.Calendar cal2 = java.util.Calendar.getInstance();

			//   different   date   might   have   different   offset   
			cal1.setTime(date1);
			long ldate1 = date1.getTime()
					+ cal1.get(java.util.Calendar.ZONE_OFFSET)
					+ cal1.get(java.util.Calendar.DST_OFFSET);

			cal2.setTime(date2);
			long ldate2 = date2.getTime()
					+ cal2.get(java.util.Calendar.ZONE_OFFSET)
					+ cal2.get(java.util.Calendar.DST_OFFSET);

			//   Use   integer   calculation,   truncate   the   decimals   
			int hr1 = (int) (ldate1 / 3600000);
			int hr2 = (int) (ldate2 / 3600000);

			int days1 = (int) hr1 / 24;
			int days2 = (int) hr2 / 24;

			int yearDiff = cal2.get(java.util.Calendar.YEAR)
					- cal1.get(java.util.Calendar.YEAR);
			int monthDiff = yearDiff * 12 + cal2.get(java.util.Calendar.MONTH)
					- cal1.get(java.util.Calendar.MONTH);
			int dateDiff = days2 - days1;
			int hourDiff = hr2 - hr1;
			int minuteDiff = (int) (ldate2 / 60000) - (int) (ldate1 / 60000);
			int secondDiff = (int) (ldate2 / 1000) - (int) (ldate1 / 1000);

			if (interval.equals("Y")) {
				intReturn = yearDiff;
			} else if (interval.equals("M")) {
				intReturn = monthDiff;
			} else if (interval.equals("D")) {
				intReturn = dateDiff;
			} else if (interval.equals("H")) {
				intReturn = hourDiff;
			} else if (interval.equals("m")) {
				intReturn = minuteDiff;
			} else if (interval.equals("S")) {
				intReturn = secondDiff;
			}
		} catch (Exception ex) {
		}
		return intReturn;
	}
	
	public static Calendar getMailCleanTime(){
		Calendar c = DateUtil.parse(DateUtil.getBeforeToday(31),"yyyy-MM-dd");
		c.set(Calendar.HOUR_OF_DAY, 23);
		c.set(Calendar.MINUTE, 59);
		c.set(Calendar.SECOND, 59);
		return c;
	}
}
