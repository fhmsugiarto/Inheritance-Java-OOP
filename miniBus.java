//inheritance from class vehichle
public class miniBus extends vehicle{
  private int capacity;
    public miniBus(String brand, int capacity){
        super(brand,null);
        this.setCapacity(capacity);
    }
    
    //setter
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    //getter
    public int getCapacity(){
        return capacity;
    }
    
    @Override    
    public String toString(){
        return "Brand = "+ this.getBrand()+"\nMax Passenger = "+this.getCapacity();
    }
}