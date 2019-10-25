package hcy.factory.abstractfactory;

import java.lang.reflect.InvocationTargetException;

public class DataAccess {
    private static final String packageName = "hcy.factory.abstractfactory";
    private static final String db = "SqlServer";

    public static IUser createUser() {
        try {
            return (IUser) Class.forName(packageName + "." + db + "User").getConstructor().newInstance();
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException | ClassNotFoundException e) {
            return null;
        }
    }

    public static IDepartment createDepartment() {
        try {
            return (IDepartment) Class.forName(packageName + "." + db + "Department").getConstructor().newInstance();
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException | ClassNotFoundException e) {
            return null;
        }
    }
}
