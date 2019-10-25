package hcy.factory.abstractfactory;

public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("access insert user");
    }

    @Override
    public User get(int id) {
        System.out.println("access get user");
        return null;
    }
}
