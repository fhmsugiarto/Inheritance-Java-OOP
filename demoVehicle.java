public class demoVehicle{
    public static void main(String[]args){
        //make new object and print method toSTring()
        miniBus miniBus1 = new miniBus("Grand Max", 7);
        truck truck1 = new truck("Medium Duty Fuso", 26);
        
        System.out.println(miniBus1);
        System.out.println(truck1);
    }
}