//inheritance from class vehicle
public class truck extends vehicle{
    int capacity;
    public truck(String brand, int capacity){
        super(brand, null);
        this.setCapacity(capacity);
    }
    //setter encapsulation
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    //getter encapsulation
    public int getCapacity(){
        return capacity;
    }
    @Override
    public String toString(){
        return "Brand = "+ this.getBrand()+"\nMax Capacity = "+this.getCapacity();
    }

}