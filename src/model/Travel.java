package model;

public class Travel {

    private String sourceData;
    private String destinationData;
    private int unitvalue;

    public Travel(String sourceData, String destinationData, int unitvalue) {
        super();
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

}