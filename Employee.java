import java.util.*;

public class Employee {
    private String id;
    private String name;
    private String phone;
    private Set<Permit> permitSet;


    public Employee(String id, String name, String phone) { //constructor
        this.id = id;
        this.name = name;
        this.phone = phone;
    }



// getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Permit> getPermitSet() {
        return permitSet;
    }

    public void setPermitSet(Set<Permit> permitSet) {
        this.permitSet = permitSet;
    }
}
