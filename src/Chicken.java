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

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            validateAge("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private void validateAge(String message) {
        throw new IllegalArgumentException(message);
    }

    public double productPerDay() {

    }

    private double calculateProductPerDay() {

    }

    private void validateNameLength(String message) {
        throw  new IllegalArgumentException(message);
    }


}
