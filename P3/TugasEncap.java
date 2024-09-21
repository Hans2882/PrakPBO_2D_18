package P3;

public class TugasEncap {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 30) {
            System.out.println("Umur tidak boleh lebih dari 30");
        }
        else if (newAge < 18) {
            System.out.println("Umur tidak boleh kurang dari 18");
        } else {
            age = newAge;
        }
    }
}
