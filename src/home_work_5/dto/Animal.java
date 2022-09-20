package home_work_5.dto;

public class Animal {
    int age;
    String nick;

    public Animal(int age, String nick){
            this.nick = nick;
            this.age = age;

        }

        public String getNick() {
            return nick;
        }


        public int getAge() {
            return age;
        }


        public String toString(){
            StringBuilder builder = new StringBuilder();

            if(!builder.isEmpty())
                builder.append("[");
            else
                builder.append("{age: " + getAge() + ", " +
                        "nick: " + "\"" +getNick() +"\"" + "}");
            if(builder.isEmpty())
                builder.append("]");
            return builder.toString();
        }
}
