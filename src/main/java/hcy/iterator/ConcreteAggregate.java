package hcy.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {
    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int getCount() {
        return items.size();
    }

    public Object getValue(int index) {
        return items.get(index);
    }

    public void setValue(int index, Object object) {
        items.add(index, object);
    }
}
