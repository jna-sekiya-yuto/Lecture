package test7;

/**
 * 人クラス
 */
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

    // 【時間が余った人向け】
    public boolean isBestPartner(Person person) {
        BloodType compatibleType = bloodType.findCompatibleType();
        // BloodType.findCompatibleType()の戻り値がnull許容のためnullチェック実施
        return compatibleType != null &&
                compatibleType.equals(person.getBloodType());
    }

}
