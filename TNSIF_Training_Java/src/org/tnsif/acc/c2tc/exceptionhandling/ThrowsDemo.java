package org.tnsif.acc.c2tc.exceptionhandling;

import java.io.IOException;

public class ThrowsDemo {

    
    void print() {
        System.out.println("Hello World");
    }

   
    void fileReading() throws IOException {
        System.out.println("File not Found");
        
    }

    
    void Division() throws ArithmeticException, ClassNotFoundException, IOException {
        System.out.println("Can't divide by zero");
   
    }

	

	public static void main(String[] args) {

        ThrowsDemo obj = new ThrowsDemo();
        
        
        obj.print();

  
        try {
            obj.fileReading();
        } catch(IOException e) {
            System.out.println("Caught IOException: " + e);
        }

        try {
            obj.Division();
        } catch(ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e);
        } catch(ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e);
        } catch(IOException e) {
            System.out.println("Caught IOException in Division: " + e);
        }
    }
		

	}

