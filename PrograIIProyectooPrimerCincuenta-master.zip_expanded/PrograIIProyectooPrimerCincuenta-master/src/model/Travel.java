package model;

public class Travel {

    private byte id;
	private String sourceData;
    private String destinationData;
    private int unitvalue;

    public Travel(byte id,String sourceData, String destinationData, int unitvalue) {
        super();
        this.id= id;
        this.sourceData = sourceData;
        this.destinationData = destinationData;
        this.unitvalue = unitvalue;
    }

    public String getSourceData() {
        return sourceData;
    }

    public void setSourceData(String sourceData) {
        this.sourceData = sourceData;
    }

    public String getDestinationData() {
        return destinationData;
    }

    public void setDestinationData(String destinationData) {
        this.destinationData = destinationData;
    }

    public int getUnitvalue() {
        return unitvalue;
    }

    public void setUnitvalue(int unitvalue) {
        this.unitvalue = unitvalue;
    }

	public byte getId() {
		return id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Travel id=" + id + "\nsourceData=" + sourceData + "\ndestinationData=" + destinationData
				+ "\nunitvalue=" + unitvalue;
	}
    

}