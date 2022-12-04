public class Test {
    public static void main(String[] args){
        CarParkSystem carpark = new CarParkSystem();

        System.out.println(carpark);

        //Test add an Employee
        carpark.addEmployee("E01", "Thanh", "1");
        carpark.addEmployee("E02", "Mai", "2");

        System.out.println(carpark);

        carpark.changeEmployeePhone("E01", "4");
    }
}
