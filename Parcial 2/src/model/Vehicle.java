package model;

public abstract class Vehicle {

	protected String plate;
	protected String mark;
	protected short model;
	protected String color;
	protected float speed;

	public Vehicle() {

	}

	public Vehicle(String plate, String mark, short model, String color, float speed) {
		this.plate = plate;
		this.mark = mark;
		this.model = model;
		this.color = color;
		this.speed = speed;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public short getModel() {
		return model;
	}

	public void setModel(short model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public boolean speedUp(float speed) {

		if (speed > 0) {

			setSpeed(speed);
			return true;

		}
		return false;

	}

	public float breaking(float percent) {

		float brk;
		float brkafinal;

		if (getSpeed() > 0 && percent <= 100) {

			brk = (getSpeed() * percent) / 100;
			brkafinal = brk - getSpeed();
			return brkafinal;
		}
		return 0.0f;
	}

	@Override
	public String toString() {
		return "Vehicle [plate=" + plate + ", mark=" + mark + ", model=" + model + ", color=" + color + ", speed="
				+ speed + "]";
	}

}
