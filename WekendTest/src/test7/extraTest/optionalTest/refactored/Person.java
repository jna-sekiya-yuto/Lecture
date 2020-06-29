package test7.extraTest.optionalTest.refactored;

import java.util.Optional;

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

    public boolean isBestPartner(Person anotherPerson) {
        Optional<BloodType> compatibleType = bloodType.findCompatibleType();
        return compatibleType.isPresent() &&
                compatibleType.get() == anotherPerson.getBloodType();
    }
}
