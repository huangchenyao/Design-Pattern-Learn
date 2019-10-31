package hcy.composite;

public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth) + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "员工招聘培训管理");
    }
}
