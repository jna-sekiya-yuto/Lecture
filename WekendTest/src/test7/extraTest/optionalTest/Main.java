package test7.extraTest.optionalTest;

public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("田中", BloodType.A),
                new Person("小林", BloodType.B),
                new Person("渡辺", BloodType.O),
                new Person("加藤", BloodType.AB)
        };

        for (Person targetPerson : persons) {
            BloodType targetBloodType = targetPerson.getBloodType();
            System.out.println(targetPerson.getName() + "さんは" + targetBloodType + "型です。");
            System.out.println("特徴は" + targetBloodType.getCharacteristic() + "です。");
            System.out.print("相性の良い人は、");

            for (Person person : persons) {
                if (targetPerson.isBestPartner(person)) {
                    System.out.println(person.getName() + "さんです。");
                }
            }
            System.out.println("----------------------------");
        }
    }
}
