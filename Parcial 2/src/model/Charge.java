package model;

public class Charge extends Vehicle {

	protected float capacity;
	protected boolean single;
	protected float maxSpeed;
	protected boolean state;

	
	public Charge(float capacity, boolean single, float maxSpeed, boolean state, String plate, String mark, short model, String color, float speed) {
		super(plate, mark, model, color, speed );
		this.capacity = capacity;
		this.single = single;
		this.maxSpeed = maxSpeed;
		this.state = state;
	}

	public float getCapacity() {
		return capacity;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public boolean isSingle() {
		return single;
	}

	public void setSingle(boolean single) {
		this.single = single;
	}

	public float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	
	@Override
	public float breaking(float percent) {
		float brk;
		float additionBkar;
		float brkafinal;

		if (getSpeed() > 0 && percent <= 100) {

			brk = (getSpeed() * percent) / 100;
			additionBkar= getSpeed() * 0.5f;
			brkafinal = (brk +additionBkar)- getSpeed();
			return super.breaking(brkafinal);

		}
		return 0.0f;
	}
	
	@Override
	public boolean speedUp(float speed) {
		
		return super.speedUp(speed);
	}

}
