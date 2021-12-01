//inheritance from class vehichle
public class miniBus extends vehicle{
  private int passenger;
    public miniBus(String brand, int passenger){
        super(brand,null);
        this.setPassenger(passenger);
    }
    //setter encapsulation
    public void setPassenger(int passenger){
        this.passenger=passenger;
    }
    //getter encapsulation
    public int getPassenger(){
        return passenger;
    }
    @Override    
    public String toString(){
        return "Brand = "+ this.getBrand()+"\nMax Passenger = "+this.getPassenger();
    }
}