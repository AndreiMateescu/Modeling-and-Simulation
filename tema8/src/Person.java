public class Person {

    private int time;

    public Person(int time){
        this.time = time;
    }

    public void setTime(int time){
        this.time = time;
    }

    @Override
    public String toString(){
        return "Person with time: " + this.time;
    }
}
