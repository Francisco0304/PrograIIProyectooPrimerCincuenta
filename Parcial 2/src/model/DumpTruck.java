package model;

public class DumpTruck extends Charge{
	

private float power;
	

	public DumpTruck(float capacity, boolean single, float maxSpeed) {
		super(capacity, single, maxSpeed);
	}

	public float getPower() {
		return power;
	}
	
	public void setPower(float power) {
		this.power = power;
	}
}
