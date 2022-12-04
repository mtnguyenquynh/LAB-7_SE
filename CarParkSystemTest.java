public class CarParkSystemTest {
    public static void main(String[] args){
        CarParkSystem carpark = new CarParkSystem();

        System.out.println(carpark);

        //Test add an Employee
        carpark.addEmployee("E01", "Thanh", "1");
        carpark.addEmployee("E02", "Mai", "2");
        carpark.addEmployee("E03", "Quynh", "3");
        carpark.addEmployee("E04", "Nguyen", "4");

        System.out.println(carpark);

        //Test change employee phone
        System.out.println("Change employee phone");
        carpark.changeEmployeePhone("E01", "4");
        System.out.println(carpark);

        //Error
        //Test add permit
        System.out.println("Add permit");
        carpark.addPermit("P01", "R01", "Busan", "E01");
        System.out.println(carpark);

        //Test delete an employee
        System.out.println("Delete an employee");
        carpark.deleteEmployee("E02");
        System.out.println(carpark);

        //Error
        //Terminate permit
        System.out.println("Terminate permit");
        carpark.terminatePermit("P01");
        System.out.println(carpark);

        //Error
        //Replace permit
        System.out.println("Replace permit");
        carpark.replacePermit("P01", "P02", "R02", "Hokaido");
        System.out.println(carpark);

        //Error
        //Get employee detail
        System.out.println("Get employee detail");
        carpark.getEmployeeDetail("P01");
        System.out.println(carpark);

        //Error
        //List all the permits detail
        System.out.println("List all permits detail");
        carpark.getPermitDetail();

    }
}
