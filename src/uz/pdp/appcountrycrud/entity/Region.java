package uz.pdp.appcountrycrud.entity;

public class Region {
    private Integer idNumber;
    private String name;

    public Region(Integer idNumber, String name) {
        this.idNumber = idNumber;
        this.name = name;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Region{" +
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
