public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if (name.length() < 1) {
            validateNameLength();
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            validateAge();
        }
        this.age = age;
    }

    private void validateAge() {
        throw new IllegalArgumentException("Age should be between 0 and 15.");
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if (age < 6) {
            return 2;
        }

        if (age > 11) {
            return 0.75;
        }

        return 1;
    }

    private void validateNameLength() {
        throw new IllegalArgumentException("Name cannot be empty.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
