package java_practice.practice.productorder;

public class Student {
    String name;
    int score;
    int id;

    public Student (String name , int score,int id) {
      this.name = name ;
      this.score = score ;
      this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public Student(int id) {
        this.id = id;
    }

    
}
