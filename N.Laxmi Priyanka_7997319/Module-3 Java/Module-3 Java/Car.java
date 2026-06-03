public class Car {
    String make;
    String model;
    int year;

    Car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    void displayDetails(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }

    public static void main(String[] args) {
        Car c=new Car("Kia","Seltos",2023);
        c.displayDetails();
    }
}
