public class TotalFuelConsumption {
    
public static void main(String[] args) { 
	
	// Degiskenlerim
	
	int distance =450;
	double consuptionPer100Km =7.5;
	double fuelPrice =52;
	double highwayFee =250;
	int numberOfPeople =3;
	
	// Hesaplar
	double totelFuel = distance * consuptionPer100Km /100;
	double fuelCost = totelFuel + fuelPrice;
	double totelcost = fuelCost + highwayFee;
	double costPerPerson = totelcost / numberOfPeople ;
	
	//Cikti
	
	System.out.println ("Total Fuel Comsumption:"+ totelFuel + "L");
	System.out.println ("Fuel Cost:" +fuelCost + "TL");
	System.out.println ("Total Travel Cost:"+ totelcost +"TL");
	System.out.println ("Cost Per Person:"+costPerPerson + "TL");
	
	}
}

