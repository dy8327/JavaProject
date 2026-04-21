package Java_Generic_0421;
import java.util.Comparator;
import java.util.TreeSet;

class Person1{
    private int id;
    private int score;
    Person1(){}
    Person1(int id, int score){this.id = id; this.score=score;}
    int getid(){return id;}
    public String toString(){return "[id="+id+", score="+score+"]";}
}

class PersonComparator implements Comparator<Person1>{
    public int compare(Person1 o1, Person1 o2){
        return o1.getid() - o2.getid();
        }
}
public class Code245 {
    public static void main(String[] args) {
        TreeSet<Person1> ts = new TreeSet<>(new PersonComparator());
        ts.add(new Person1(3,83));
        ts.add(new Person1(5,90));
        ts.add(new Person1(1,93));
        ts.add(new Person1(2,88));
        ts.add(new Person1(4,70));
        for(Person1 p:ts){
        System.out.println(p);
    }}
}
