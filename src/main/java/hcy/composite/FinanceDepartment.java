package hcy.composite;

public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
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
        System.out.println(name + "公司财务收支管理");
    }
}
