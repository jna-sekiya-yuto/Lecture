package test7;

/**
 * 血液型Enum
 */
public enum BloodType {
    A("几帳面"),
    B("好奇心旺盛"),
    O("社交的"),
    AB("天才肌");

    // 特徴
    private String characteristic;

    /**
     * コンストラクタ
     * Enumのコンストラクタは必ずprivateである(理由は調べてみよう)
     * ただしアクセス修飾子なしでもprivateとしてみなされるので、アクセス修飾子なしでも可
     */
    private BloodType(String characteristic) {
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
    public BloodType findCompatibleType() {
        switch (this) {
            case A:
                return O;
            case B:
                return AB;
            case O:
                return A;
            case AB:
                return B;
            default:
                return null;
        }
    }
}
