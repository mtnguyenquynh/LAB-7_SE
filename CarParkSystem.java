import java.util.*;

public class CarParkSystem {
    private final Set<Employee> employeeList;
    private final Set<Permit> permitList;

    public CarParkSystem( )
    {

        employeeList = new HashSet<Employee>( );
        permitList = new HashSet<Permit>( );

    }

    public Employee searchEmployee(String id)
    {
        Employee employee = null;
        for (Employee e: employeeList){
            if((e.getId()).equals(id))
            {
                employee = e;
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
        if(!precondition){
        e.setPhone(phone);
        }
    }

    public Permit searchPermit(String permitNr)
    {
        Permit permit = null;
        for (Permit p: permitList){
            if((p.getPermitNr()).equals(permitNr))
            {
                permit = p;
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
                permit = p;
                break;
            }
        }
        return permit;
    }
    //add permit
    public void addPermit(String permitNr, String regNr, String area, String id){

        Employee owner = searchEmployee(id);
        Permit p;
        boolean precondition = (owner != null && !(owner.getPermits().size() <2));

        if(precondition){
            if((searchPermit(permitNr)==null)){
                if((searchRegNumber(regNr)==null)){
                    p = new Permit(permitNr, regNr, area, owner);

        owner.addPermit(p);
        permitList.add(p);}}}
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
        if(!precondition){
        p.getOwner().getPermits().remove(p);
        permitList.remove(p);}
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
        assert owner != null;
        return owner.getId() + owner.getName() + owner.getPhone();
    }

    //List all the permits details
    public List<Object> getPermitDetail(){
        List<Object> result = new ArrayList<>();
        if(permitList.size()>0){
        for(Permit p : permitList) {
            Employee e = p.getOwner();
            result.add(p.getPermitNr());
            result.add(e.getId());
            result.add(e.getName());
            result.add(e.getPhone());
            result.add(p.getRegNr());
        }}
        return result;
    }
    @Override
    public String toString() {
        return "CarParkSystem{" +
                "employeeList=" + employeeList +
                ", permitList=" + permitList +
                '}';
    }
}
