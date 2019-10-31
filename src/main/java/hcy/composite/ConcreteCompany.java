package hcy.composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        company.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth) + name);
        children.forEach(company -> company.display(depth + 2));
    }

    @Override
    public void lineOfDuty() {
        children.forEach(Company::lineOfDuty);
    }
}
