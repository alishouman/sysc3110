
final class BagImpl implements Bag {
	/**
 * 
 */
private final BagExample BagExample;

/**
 * @param bagExample
 */
BagImpl(BagExample bagExample) {
	BagExample = bagExample;
}

	Object o;

	public Object get()
     {
        return o;
     }

	public void set(Object o)
     {
        this.o = o;
     }
}