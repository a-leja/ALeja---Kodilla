package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;


public class ExceptionModuleRunner {

    public static void main(String args[]) {

        FileReader fileReader = new FileReader();

        try {
            fileReader.readFile();
        } catch (FileReader e) {
            System.out.print("Problem while reading a file!");
        }
    }
}