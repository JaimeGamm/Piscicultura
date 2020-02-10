package persistence;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import models.Pond;

public class WriteBinario {
	public void createBinario(String path,	ArrayList<Pond> fishFarmingRegisterList ) throws FileNotFoundException {
		
        try(DataOutputStream cultivo=new DataOutputStream(new FileOutputStream(path+".txt"));){
        	for (Pond pond : fishFarmingRegisterList) {
        		
        	     cultivo.writeInt((int) pond.getId());
        	     cultivo.writeInt((int) pond.getYear());
        	     cultivo.writeUTF(pond.getMunicipality());
        	     cultivo.writeInt((int) pond.getSeeded());
        	     cultivo.writeInt((int) pond.getHaversted());
        	     cultivo.writeInt((int) pond.getWeight());
        	     cultivo.writeInt((int) pond.getProduction());
        	     cultivo.writeInt((int) pond.getPrice());
        	     
        	}
        }catch(IOException e){
            System.out.println("Error E/S");
        }
 
    
       
	}
	 
}
