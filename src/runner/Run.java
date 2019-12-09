package runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.DeserializationException;

import controller.Control;

public class Run {
	public static void main(String[] args) throws FileNotFoundException, IOException, DeserializationException {
       new Control(); 
	}   
}

