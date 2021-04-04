
public class Person implements Comparable<Person> {

    String name;
    int age;
    double weight;

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
       return this.name;
   }

   public void setNameAgeWeight(String setName, int setAge, double setWeight) {
       name = setName;
       age = setAge;
       weight = setWeight;
   }

   public int getAge() {
       return age;
   }

   public double getWeight() {
       return weight;
   }

   public int compareTo(Person p) {
        if (name.compareTo(p.name) != 0) {
            return name.compareTo(p.name);
        } else if (age != p.age) {
            return age - p.age;
       } else {
            return (int) (weight - p.weight);
        }
   }
   public String toString() {
        return "{" + name + ", " + age + ", " + weight + "}";
   }

}
