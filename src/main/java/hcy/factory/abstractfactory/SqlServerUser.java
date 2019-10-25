package hcy.factory.abstractfactory;

public class SqlServerUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("sql server insert user");
    }

    @Override
    public User get(int id) {
        System.out.println("sql server get user");
        return null;
    }
}
