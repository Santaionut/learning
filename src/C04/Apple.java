package C04;

public class Apple {

    boolean checkedOut = false;
    public String name;


    public Apple(String name, boolean checkedOut) {
        this.name = name;
        this.checkedOut = checkedOut;
    }

    void checkIn(){
        checkedOut = false;
    }

    public void finalize(){
        if(checkedOut)
            System.out.println("Error : checked out");
    }
}
