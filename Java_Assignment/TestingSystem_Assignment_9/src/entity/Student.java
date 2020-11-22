package entity;

public class Student {
    private String name;
    private static int keepTrack = 0;
    private  int id;

    public Student(String name) {
        this.name = name;
       this.id =  keepTrack++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Deprecated
    public int getID()
    {
        return id;
    }
    public String getId() {
        return "MSV " + id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
