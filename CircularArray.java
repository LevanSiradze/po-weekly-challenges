public class CircularArray<T> implements Iterable<T> {
    private T[] carr;
    public CircularArray(T[] carray){
        this.carr = carray;
    }
    //get obj at index
    public T get(int i) {
        return carr[i];
    }
    //get the array
    public T[] get() {
        return carr;
    }
    //cycle array elements backwards
    public backCycle(){
        T o = carr[0];
        for (int i = 0; i < carr.length - 2; i++) {
            carr[i] = carr[i + 1];
        }
        carr[carr.length - 1] = o;
    }
    //cycle array elements forward
    public frontCycle(){
        T o = carr[0];
        for (int i = carr.length - 1; i > 0; i--) {
            carr[i] = carr[i - 1];
        }
        carr[0] = o;
    }
    @Override
    public Iterator<T> iterator() {
        return Arrays.stream(carr).iterator();
    }
}
