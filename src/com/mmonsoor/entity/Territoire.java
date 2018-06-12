package com.mmonsoor.entity;

public class Territoire {
	private String type;
	private int superficie;
	//Constructeur
	public Territoire(String tmpType,int tmpSuperficie) {
		type=tmpType;
		superficie=tmpSuperficie;
	}
	/*
	 * Une méthode qui présente le Territoire en retournant un String (superficie en hectares)
	 */
	public String presentation() {
		return("Bonjour je suis un territoire de type "+type+","+" et j'ai une superficie de "+superficie+" hectares");
	}
	public String getType() {
		return type;
	}
	

}
