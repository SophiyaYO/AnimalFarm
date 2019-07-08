public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if (name.length() < 1) {
            validateNameLength("Name cannot be empty.");
        }
        this.name = name;
    }

    private void validateNameLength(String message) {
       throw  new IllegalArgumentException(message);
    }

    private void setAge(int age) {
        this.age = age;
    }

    public double productPerDay() {

    }

    private double calculateProductPerDay() {

    }


}
