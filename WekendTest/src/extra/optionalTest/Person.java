package extra.optionalTest;

public class Person {
    // 名前
    private String name;
    // 血液型
    private BloodType bloodType;

    public Person(String name, BloodType bloodType) {
        this.name = name;
        this.bloodType = bloodType;
    }

    public String getName() {
        return name;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public boolean isBestPartner(Person person) {
        return bloodType.findCompatibleType() == person.getBloodType();
    }
}
