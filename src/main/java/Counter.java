
public class Counter {

    private int value;

    private Listener listener;
    public Counter(int initialVaue){
        this.setValue(initialVaue);
    }
    public Counter(int initialVaue, Listener listener){
        this.setValue(initialVaue);
        this.setListener(listener);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void decrement(){
        this.setValue(this.getValue()-1);
    }

    public void register(){

    }

    public Listener getListener() {
        return listener;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }
}
