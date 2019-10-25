package hcy.factory.abstractfactory;

public interface IFactory {
    IUser createUser();

    IDepartment createDepartment();
}
