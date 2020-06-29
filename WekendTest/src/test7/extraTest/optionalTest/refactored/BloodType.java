package test7.extraTest.optionalTest.refactored;

import java.util.Optional;

public enum BloodType {
    A("几帳面"),
    B("好奇心旺盛"),
    O("社交的"),
    AB("天才肌");

    // 特徴
    private String characteristic;

    /**
     * コンストラクタ
     */
    BloodType(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    /**
     * 相性診断を行う
     * A型とO型、B型とAB型が相互に相性が良い
     * ただし血液型がA~ABのどれとも一致しない場合nullを返却
     *
     * @return 血液型
     */
    public Optional<BloodType> findCompatibleType() {
        switch (this) {
            case A:
                return Optional.of(O);
            case B:
                return Optional.of(AB);
            case O:
                return Optional.of(A);
            case AB:
                return Optional.of(B);
            default:
                return Optional.empty();
        }
    }
}
