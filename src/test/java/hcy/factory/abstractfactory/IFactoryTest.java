package hcy.factory.abstractfactory;

import org.junit.Test;

public class IFactoryTest {
    @Test
    public void test() {
        User user = new User();
        Department department = new Department();

//        IFactory factory = new SqlServerFactory();
//        IFactory factory = new AccessFactory();

        IUser iUser = DataAccess.createUser();
        iUser.insert(user);
        iUser.get(1);

        IDepartment iDepartment = DataAccess.createDepartment();
        iDepartment.insert(department);
        iDepartment.get(1);
    }
}