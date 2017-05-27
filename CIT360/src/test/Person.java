package test;

import java.util.HashMap;

public class Person {

    String name;
    Boolean alive = false;
    private HashMap<String, Integer> map = new HashMap<String, Integer>();

    public String addToMap;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean isAlive() {
        return alive;
    }

    public boolean isAliveNow(){
        alive = true;
        return alive;
    }

    public void throwException() throws RuntimeException{
        throw new RuntimeException("There was a runtime exception.");
    }

    public Boolean addToMap() {
        map.put("adding", 10);
        return map.isEmpty();
    }
}
