import java.util.*;

public class Employee  {
    private String id;
    private String name;
    private String phone;
    private HashSet<Permit> permits;

    public Employee(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.permits = new HashSet<Permit>();
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", permits=" + permits +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Set<Permit> getPermits() {
        return permits;
    }

    public void setPermits(HashSet<Permit> permits) {
        this.permits = permits;
    }
    public void addPermit(Permit p){
        permits.add(p);
    }
}

