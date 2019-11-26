package persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MyFile {

    private File file;
    private FileWriter fileWriter;
    private FileReader fileReader;
    private BufferedWriter bufferWriter = null;
    private BufferedReader bufferReader = null;
    public static final char W = 'w';
    public static final char R = 'r';
	
    public MyFile(String fileName){
	file = new File(fileName);
    }
	
    public String getName() {
	return file.getName();
    }
	
    private void openFile(char mode) throws IOException{
	if (mode==W){
            fileWriter = new FileWriter(file);
            bufferWriter = new BufferedWriter(fileWriter);
	}else{
            fileReader = new FileReader(file);
            bufferReader = new BufferedReader(fileReader);
        }
    }
	
    private void closeFile() throws IOException{
	if (bufferReader!=null)
            bufferReader.close();
	if (bufferWriter!=null)
            bufferWriter.close();
    }
	
    public void wiriteRecords(ArrayList<String> information)throws IOException{
	this.openFile(W);
	if (bufferWriter!=null){
            for (String register : information) {
		bufferWriter.write(register);
		bufferWriter.newLine();	
            }
	}
	this.closeFile();
    }
	
    public int counterNumRegisters()throws IOException{
	int counter = 0;
	String cad;
	this.openFile(R);
	while((cad = bufferReader.readLine()) != null){
            if(!cad.equals(""))
            counter++;
	}
	this.closeFile();
	return counter;
    }
	
    public ArrayList<String> readRecords()throws IOException{
	ArrayList<String> information = new ArrayList<String>();
	String cad="";
	this.openFile(R);
	while((cad = bufferReader.readLine()) != null) {
            if(!cad.equals("")) {
		information.add(cad);
            }
	}
	this.closeFile();
	return information;
    }
}
