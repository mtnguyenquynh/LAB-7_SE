import java.util.*;

public class CarParkSystem {
    private Set<Employee> employeeList;
    private Set<Permit> permitList;

    public CarParkSystem( )
    {

        employeeList = new HashSet<Employee>( );
        permitList = new HashSet<Permit>( );

    }
    public Set<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(Set<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Set<Permit> getPermitList() {
        return permitList;
    }

    public void setPermitList(Set<Permit> permitList) {
        this.permitList = permitList;
    }

    public Employee searchEmployee(String id)
    {
        Employee employee = null;
        for (Employee e: employeeList){
            if((e.getId()).equals(id))
            {
                employee = (Employee) e;
                break;
            }
        }
        return employee;
    }
    //add new employee UC1
    public void addEmployee(String id, String name, String phone){
        Employee employee = searchEmployee(id);
        boolean precondition = (employee == null);
        if(precondition){
            employee = new Employee(id, name, phone);
            employeeList.add(employee);
        }
    }

    //change employee phone
    public void changeEmployeePhone(String id, String phone){
        Employee e = searchEmployee(id);
        boolean precondition = (e == null);
        if(precondition){
        e.setPhone(phone);
        }
    }

    public Permit searchPermit(String permitNr)
    {
        Permit permit = null;
        for (Permit p: permitList){
            if((p.getPermitNr()).equals(permitNr))
            {
                permit = (Permit) p;
                break;
            }
        }
        return permit;
    }

    public Permit searchRegNumber(String regNr){
        Permit permit = null;
        for (Permit p: permitList){
            if((p.getRegNr()).equals(regNr))
            {
                permit = (Permit) p;
                break;
            }
        }
        return permit;
    }
    //add permit
    public void addPermit(String permitNr, String regNr, String area, String id){

        Employee owner = searchEmployee(id);
        Permit p = null;
        boolean precondition = (owner == null && !(owner.getPermits().size() <2));

        if(precondition)
            if((searchPermit(permitNr)==null))
                if((searchRegNumber(regNr)==null))
                    p = new Permit(permitNr, regNr, area, owner);

       owner.getPermits().add(p);
        //owner.permits.add(p);
        permitList.add(p);
    }

    //delete an employee
    public void deleteEmployee(String id){
        Employee e = searchEmployee(id);
        boolean precondition = (e == null);
        if(!precondition){
            employeeList.remove(e);
        }
    }

    //terminate a permit
    public void terminatePermit(String permitNr){
        //check p in permitList
        Permit p = searchPermit(permitNr);
        boolean precondition = (p == null);
        if(!precondition)
        p.getOwner().getPermits().remove(p);
        permitList.remove(p);
    }

    public void replacePermit(String oldPermitNr, String newPermitNr, String regNr, String area){

        Permit oldP = searchPermit(oldPermitNr);
        Permit newP = searchPermit(newPermitNr);
        Permit regN = searchRegNumber(regNr);

        if(oldP != null){
            if(newP == null && regN == null){
                Employee owner = oldP.getOwner();
                newP = new Permit(newPermitNr, regNr, area, owner);
                owner.getPermits().remove(oldP);
                owner.getPermits().add(newP);
                permitList.remove(oldP);
                permitList.add(newP);
            }
        }
    }

    //get the details of the employee who has the permit
    public String getEmployeeDetail(String permitNr){
        Permit p = searchPermit(permitNr);
        Employee owner = null;
        if(p != null){
            owner = p.getOwner();
        }
        return owner.getId() + owner.getName() + owner.getPhone();
    }

    //List all the permits details
    public String getPermitDetail(){
        List result = new ArrayList<>();

        return ;
    }
    @Override
    public String toString() {
        return "CarParkSystem{" +
                "employeeList=" + employeeList +
                ", permitList=" + permitList +
                '}';
    }
}
