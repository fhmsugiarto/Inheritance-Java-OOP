//abstract class
public abstract class vehicle{
    private String brand, year;
    //constructor
    public vehicle(String brand, String year){
        this.setBrand(brand);
        this.setYear(year);
    }
    //setter encapsulation
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setYear(String year){
        this.year=year;
    }
    //getter encapsulation
    public String getBrand(){
        return brand;
    }
    public String getYear(){
        return year;
    }
    //method toString()
    public String toString(){
        return "Brand = "+this.getBrand()+ "\nYear = "+ this.getYear();
    }
}