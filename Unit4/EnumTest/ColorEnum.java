public enum ColorEnum {
    RED("BLUE", 1),
    GREEN("ORANGE", 2),
    WHITE("BLACK", 3),
    YELLOW("PURPLE", 4);
    /*
    枚举的对象，都可以有自己的属性
    */
    private String name;
    private int index;

    private ColorEnum(String name, int index) {
        this.name = name;
        this.index = index;
    }
    public String getName() {
        return name;
    }
    public int getIndex() {
        return index;
    }

    public static String getNameByIndex(int index) {
        for (ColorEnum color : ColorEnum.values()) {
            if (color.getIndex() == index) {
                return color.getName();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return index + ":" + name;
    }
}
class ColorEnumTest {
    public static void main(String[] args) {

        System.out.println(ColorEnum.RED);
        System.out.println(ColorEnum.GREEN);

        System.out.println("WHITE的名字: " + ColorEnum.WHITE.getName());
        System.out.println("YELLOW的索引: " + ColorEnum.YELLOW.getIndex());

        System.out.println("索引2对应的颜色: " + ColorEnum.getNameByIndex(2));
        System.out.println("索引5对应的颜色: " + ColorEnum.getNameByIndex(5)); // 测试无效索引

        for (ColorEnum color : ColorEnum.values()) {
            System.out.println(color);
        }
        /*
        ColorEnum.values()会逐个返回枚举的内容
        for (ColorEnum color : ColorEnum.values()) 是一个增强for循环
        将冒号后的返回内容赋值给Color
        */
    }
}