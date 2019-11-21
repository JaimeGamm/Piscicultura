package model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.DeserializationException;

import persistence.Utilities;

public class FishFarming {
    private ArrayList<FishFarmingRegister> listRegister  = new ArrayList<>();
    public FishFarming() {
		
	}
	public void addJugador(FishFarmingRegister jugador) {
		listRegister.add(jugador);
	}
	
	public ArrayList<Object[]> toMatrixVector2() {
		ArrayList<Object[]> datas = new ArrayList<Object[]>();
		for (FishFarmingRegister register : listRegister) {
			datas.add( Utilities.concatObjectArrays2( register.toObjectVector()) );
		}
		return datas;
	}
	public ArrayList<FishFarmingRegister> getJugadorList() {
		return listRegister;
	}
	public void setJugadorList(ArrayList<FishFarmingRegister> jugadorList)throws FileNotFoundException, IOException, DeserializationException {
		this.listRegister = jugadorList;
	}
}
