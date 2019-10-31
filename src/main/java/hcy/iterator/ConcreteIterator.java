package hcy.iterator;

public class ConcreteIterator extends Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.getValue(0);
    }

    @Override
    public Object next() {
        Object res = null;
        current++;
        if (current < aggregate.getCount()) {
            res = aggregate.getValue(current);
        }
        return res;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.getCount();
    }

    @Override
    public Object currentItem() {
        return aggregate.getValue(current);
    }
}
