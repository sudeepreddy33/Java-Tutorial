package com.microservices.question.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.springframework.stereotype.Component;

import com.microservices.question.model.QuestionWrapper;

@Component
public class SerializableTestClass {

	public void serializableTestWriter() {

		QuestionWrapper qw = new QuestionWrapper();
		qw.setNumber(1);
		qw.setOption_A("Hello");
		qw.setOption_B("Hi");
		qw.setOption_C("Chitti");
		qw.setOption_D("Blue");
		qw.setQuestion_text("Who is mad?");

		try {
			FileOutputStream fos = new FileOutputStream("/Users/rajasudeepreddyyalla/Desktop/serializableTest.txt");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(qw);
			os.close();
			fos.close();
			
			System.out.println("data written to file:::::::::::::");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void serializableTesReader() {

		QuestionWrapper qw = new QuestionWrapper();

		try {
			FileInputStream fos = new FileInputStream("/Users/rajasudeepreddyyalla/Desktop/serializableTest.txt");
			ObjectInputStream os = new ObjectInputStream(fos);
			String a= (String)os.readObject();
			os.close();
			fos.close();
			
			System.out.println("data read from file:::::::::::::" + a);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
