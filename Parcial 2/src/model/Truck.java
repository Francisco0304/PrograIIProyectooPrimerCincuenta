package model;

import java.util.ArrayList;

public class Truck extends Charge {
	
	private ArrayList<Charge> charges;	

	public Truck(float capacity, boolean single, float maxSpeed, boolean state, String plate, String mark, short model,
			String color, float speed) {
		super(capacity, single, maxSpeed, state, plate, mark, model, color, speed);
	}


	public ArrayList<Charge> getCharges() {
		return (ArrayList<Charge>) charges.clone();
	}
	
	public float sumWeigth() {
		
		
		
		return 0.0f;
	}

	public class Charte {
		
		private double value;
		private float weight;
		
		public Charte(double value, float weight) {
			this.value = value;
			this.weight = weight;
		}
		public double getValue() {
			return value;
		}
		public void setValue(double value) {
			this.value = value;
		}
		public float getWeight() {
			return weight;
		}
		public void setWeight(float weight) {
			this.weight = weight;
		}
		
		private double calcCharter() {
			
			return 0.0;
		}
		
	}
}



