public class Car{
    String make;
    String model;
    int year;
    public void displayInfo(){
        System.out.println("Car make:"+make);
        System.out.println("Car model:"+model);
        System.out.println("Car year:"+year);

    }
    public void drive(){
        System.out.println("The"+make+""+model+"is now driving");
    }
    public static void main(String[] args) {
        Car myCar=new Car();

        myCar.make="toyota";
        myCar.model="corolla";
        myCar.year=2020;

     myCar.displayInfo();
        myCar.drive();
    }
    }
