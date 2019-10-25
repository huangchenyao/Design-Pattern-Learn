package hcy.factory.abstractfactory;

public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("sql server insert department");
    }

    @Override
    public Department get(int id) {
        System.out.println("sql server get department");
        return null;
    }
}
