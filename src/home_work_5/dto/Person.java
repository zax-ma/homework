package home_work_5.dto;

import home_work_5.PersonList;

public class Person implements Comparable<Person>{
    private String nick;
    private String password;
    private String name;





    public Person(String name, String password, String nick){
        this.nick = nick;
        this.password = password;
        this.name = name;
    }




    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Person pass) {
        return password.length() - pass.getPassword().length();
    }

    public String toString(){

        StringBuilder builder = new StringBuilder();

        if(!builder.isEmpty())
            builder.append("[");
        else
            builder.append("{name: " + getName() + ", " +
                    "password: " + getPassword() + ", " +
                    "nick: " + getNick() + "}" +"\n");
        if(builder.isEmpty())
            builder.append("]");
        return builder.toString();
    }
}
