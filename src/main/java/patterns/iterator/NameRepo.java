package patterns.iterator;

public class NameRepo implements Container{
    String[] names = new String[] {"John", "Jerry", "Rob", "Vanda"};

    private class NameIterator implements Iterator {
        int pos = 0;
        @Override
        public boolean hasNext() {
            return pos < names.length;
        }

        @Override
        public Object next() {
            if (hasNext())
                return names[pos++];
            return null;
        }
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
}
