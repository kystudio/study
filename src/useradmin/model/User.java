package useradmin.model;

/**
 * Created by kystudio on 2016/7/12.
 */
public class User {
    private int id;
    private String name;
    private String gender;
    private int age;
    private float salary;

    public User() {
        super();
    }

    public User(int id, String name, String gender, int age, float salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + age;
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + Float.floatToIntBits(salary);

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        User other = (User) obj;

        if (age!=other.age){
            return false;
        }
        if (id!=other.id){
            return false;
        }
        if (gender==null){
            if (other.gender!=null) {
                return false;
            }
        }else if (!gender.equals(other.gender)){
            return false;
        }
        if (name==null){
            if (other.name!=null) {
                return false;
            }
        }else if (!name.equals(other.name)){
            return false;
        }
        if (Float.floatToIntBits(salary)!=Float.floatToIntBits(other.salary)){
            return false;
        }

        return true;
    }
}
