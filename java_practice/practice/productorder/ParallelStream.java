package java_practice.practice.productorder;

import java.util.*;


public class ParallelStream {
    public static void main(String[] args) {
       List <Student> students_lists = Arrays.asList(
                         new Student ("ram",99,1),
                         new Student ("rajaram",59,2),
                         new Student ("ramKumar",89,3),
                         new Student ("raguram",69,4),
                         new Student ("kumaran",60,5),
                         new Student ("samRaj",79,6)  );
                    //parallelStream
                         students_lists.parallelStream().filter(ps->ps.getScore()>75).limit(5)
                         .forEach(stu->System.out.println(stu.getName()));
                    // Stream
                         students_lists.stream().filter(s ->s.getScore()<=60)
                         .limit(4)
                         
                        .forEach(stud ->System.out.println(stud.getScore()+"  "+stud.getName())); 

                


    }
}
