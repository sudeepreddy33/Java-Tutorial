//package com.sudeep.security.interviewexamples;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//import java.time.Instant;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.Month;
//import java.time.ZoneId;
//import java.time.ZonedDateTime;
//import java.util.Arrays;
//import java.util.Calendar;
//import java.util.Collections;
//import java.util.Date;
//import java.util.Set;
//import java.util.TimeZone;
//
//public class InterviewQuestions {
//
//	public static void main(String[] args) throws IOException {
//
//		// find odd or even
//		int[] i = { 1, 2, 3, 4, 5 };
//
//		for (int j : i) {
//			if (j % 2 == 0) {
//
//				System.out.println(j + "  is even");
//			} else {
//				System.out.println();
//			}
//		}
//
//		LocalDate date = LocalDate.now();
//		LocalDate date2 = LocalDate.of(2021, Month.AUGUST, 5);
//
////			ZonedDateTime zdt = ZonedDateTime.
//
//		Instant.now();
//
//		LocalDateTime local = LocalDateTime.now(ZoneId.of("Asia/Kuala_Lumpur"));
//		System.out.println(Instant.now());
//
//		Set<String> zones = ZoneId.getAvailableZoneIds();
////			System.out.println(zones);
//
//		Calendar calendarDate = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
//		System.out.println(calendarDate);
//
//		// calculate mean, median, mode
//		int[] a1 = { 2, 6, 8, 3, 4, 9 };
//
//		double sum = 0;
//		double mean = 0;
//		double median = 0;
//
//		// mean (sum/num of elements)
//		for (int n : a1) {
//			sum = sum + n;
//		}
//		mean = (sum / a1.length);
//
//		Arrays.sort(a1);
//		for (int a : a1) {
//			System.out.println(a);
//		}
//		
//		
//
//		// median (middle element)
//		int sizeHalf = a1.length / 2;
//		System.out.println("sizeHalf::::" + sizeHalf);
//		if (a1.length % 2 != 0) {
//			median = a1[(int) sizeHalf];
//		} else {
//			median = ((a1[(int) sizeHalf - 1] + a1[(int) sizeHalf]) / 2);
//		}
//
//		// mode(max occurance)
//
//		int mode = 0, maxCOunt = 0, i1, j;
//
//		for (i1 = 0; i1 < a1.length; i1++) {
//			int count = 0;
//			for (j = 0; j < a1.length; j++) {
//				if (a1[j] == a1[i1]) {
//					count++;
//				}
//			}
//			if (count > maxCOunt) {
//				maxCOunt = count;
//				mode = a1[i1];
//			}
//
//		}
//
//		System.out
//				.println("mean::::::::" + mean + " sum ::::::" + sum + " median::::::" + median + " mode::::::" + mode);
//
//		InterviewQuestions iq = new InterviewQuestions();
//		iq.add(a1);
//
//	}
//
//	public void add(int[] num) {
//		double sum = 0;
//
//		for (int n : num) {
//			sum = sum + n;
//		}
//
//		System.out.println(sum);
//
//	}
//
//}
