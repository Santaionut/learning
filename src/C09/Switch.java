package C09;

public class Switch {
    private boolean state = false;

    public boolean isState() {
        return state;
    }

    public void on(){
        state = true;
    }

    public void off(){
        state = false;
    }
}
