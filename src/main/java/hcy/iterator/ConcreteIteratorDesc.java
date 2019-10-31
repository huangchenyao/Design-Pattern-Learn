package hcy.iterator;

public class ConcreteIteratorDesc extends Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        current = aggregate.getCount() - 1;
    }

    @Override
    public Object first() {
        return aggregate.getValue(aggregate.getCount() - 1);
    }

    @Override
    public Object next() {
        Object res = null;
        current--;
        if (current >= 0) {
            res = aggregate.getValue(current);
        }
        return res;
    }

    @Override
    public boolean isDone() {
        return current < 0;
    }

    @Override
    public Object currentItem() {
        return aggregate.getValue(current);
    }
}
