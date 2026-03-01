interface cook {
    void makeFood();
}
public class Lambda {
    public static void main(String[] args) {
        // 方式1：内部类
        invokeCook(new cook() {
            public void makeFood() {
                System.out.println("享用美食！");
            }
        });

        // 方式2：Lambda表达式
        invokeCook(() -> System.out.println("享用美食！"));
    }
    public static void invokeCook(cook cook) {
        cook.makeFood();
    }
}
