package test7;

/**
 * 実行クラス
 */
public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("田中", BloodType.A),
                new Person("小林", BloodType.B),
                new Person("渡辺", BloodType.O),
                new Person("加藤", BloodType.AB)
        };

        // 複数回登場するものは一時変数として保持する(19行目、21行目、23行目)
        // 一時変数化しないとpersons[0].getBloodType().findCompatibleType()のような記述が複数出てきて見づらい

        // 田中さんについて考える
        Person targetPerson = persons[0];
        // 田中さんの血液型
        BloodType targetBloodType = targetPerson.getBloodType();
        // 田中さんと相性の良い血液型
        BloodType compatibleBloodType = targetBloodType.findCompatibleType();

        System.out.println(targetPerson.getName() + "さんは" + targetBloodType + "型です。");
        System.out.println("特徴は" + targetBloodType.getCharacteristic() + "です。");
        System.out.print("相性の良い人は、");
        for (Person person : persons) {
            // BloodType.findCompatibleType()の戻り値がnull許容のためnullチェック実施
            // 短絡評価のため、先にnullチェックを実施する
            // 短絡評価： https://qiita.com/11295/items/92d6cc92d92e48b73a47
            if (compatibleBloodType != null &&
                    compatibleBloodType.equals(person.getBloodType())) {
                // 【時間余った人向け、32,33行目がこれになる】 if (targetPerson.isBestPartner(person)){
                System.out.println(person.getName() + "さんです。");
            }
        }
    }
}
