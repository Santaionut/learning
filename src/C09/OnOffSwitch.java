package C09;

public class OnOffSwitch {
    private static Switch aSwitch = new Switch();
    public static void f() throws OnOffException1,OnOffException2{}

    public static void main(String[] args) {
        try {
            aSwitch.on();
            f();
            aSwitch.off();
        }catch (OnOffException1 exception1){
            System.err.println("OnOffException1");
            aSwitch.off();
        }catch (OnOffException2 exception2){
            System.err.println("OnOffException2");
            aSwitch.off();
        }finally {
            System.err.println("Finally");
            aSwitch.off();
        }
    }
}
