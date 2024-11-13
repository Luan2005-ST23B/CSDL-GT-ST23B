import java.util.Arrays;
import java.util.Objects;

public class SortInJava {
    static class Student implements Comparable{
        int age;
        String name;
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student [age=" + age + ", name=" + name + "]";
        }
        @Override
        public int compareTo(Object other){
            // so sanh this and other
            Student otherStudent = (Student)other; // ep kieu Student
            // 0 neu this = other
            // 1 ? this > other
            // -1 ? this < other
            if(this.age == otherStudent.age){
                return 0;
            } else if(this.age > otherStudent.age){
                return 1;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        //#1. sort an integer array --> primary type
        int[] intArray = {3, 2, 1, 0};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        //#2. sort an String array --> object type
        String[] StrArray = {"1", "0000", "22"};
        Arrays.sort(StrArray);
        System.out.println(Arrays.toString(StrArray));

        //#3. sort an student array with interface Comparable
        Student [] students = {new Student("AAAA", 20), new Student("BBBB", 17)};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));


    }
}