package hcy.factory.abstractfactory;

public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("access insert department");
    }

    @Override
    public Department get(int id) {
        System.out.println("access get department");
        return null;
    }
}
