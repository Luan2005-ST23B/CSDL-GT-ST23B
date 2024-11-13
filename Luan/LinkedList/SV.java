import java.util.Objects;

public class SV {
    private String ID;
    private String fullName;
    private int age;
    private float GPA;

    public SV() {
    }

    public SV(String ID, String fullName, int age, float GPA) {
        this.ID = ID;
        this.fullName = fullName;
        this.age = age;
        this.GPA = GPA;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "SV{" +
                "ID='" + ID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SV sv = (SV) o;
        return age == sv.age && Float.compare(GPA, sv.GPA) == 0 && Objects.equals(ID, sv.ID) && Objects.equals(fullName, sv.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, fullName, age, GPA);
    }
}
