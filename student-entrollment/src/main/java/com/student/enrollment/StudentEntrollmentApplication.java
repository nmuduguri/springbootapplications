package com.student.enrollment;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentEntrollmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentEntrollmentApplication.class, args);
		System.out.println("Student Enrollment Application Started...");
		String txt = "wipro cts infosys accenture hcl microsoft";
		
		String[] company = txt.split(" ");
		for(String com : company) {
			if(com.contains("a") ||com.contains("e") || com.contains("i") || com.contains("o") || com.contains("u")) {
				System.out.println("vowels letters contians in this company : " +com);
			}
		}
		
		int[] array = {0,1,0,1,0,1,1,1,1,0,0,0};
		
		System.out.println("before sorting "+Arrays.toString(array));
		int zeroCount = 0;
		for(Integer i : array) {
			if(i == 0) {
				zeroCount++;
			}
		}
		
		for(int i = 0; i<zeroCount; i++ ) {
			array[i] = 0;
		}
		for(int i = zeroCount; i<array.length; i++ ) {
			array[i] = 1;
		}
		System.out.println("after sorting "+Arrays.toString(array));
		
		
		
	}//main method

}
