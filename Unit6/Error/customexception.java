package src.Unit6.Error;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

class DataException extends Exception{
    private int year;
    private int month;
    private int day;

    // 第一个构造方法：重载Exception的带参构造
    public DataException(String s){
        super(s);
    }

    //// 第二个构造方法：接收年月日，校验合法性（年份、月份、日期）并抛异常
    public DataException(int year,int month,int day)throws DataException{
        super("构造日期");
        this.year = year;
        this.month = month;
        this.day = day;

        // 1. 校验月份范围（1-12）
        if (month < 1 || month > 12) {
            throw new DataException("step2.DateException: 月份必须在1到12之间");
        }

        // 2. 校验年份范围（1900-2100）
        if (year < 1900 || year > 2100) {
            throw new DataException("step2.DateException: 年份必须在1900到2100之间");
        }

        // 3. 定义平年各月最大天数（索引0对应1月，索引1对应2月...）
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        // 处理闰年2月（能被4整除且不被100整除，或能被400整除）
        if (month == 2 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            monthDays[1] = 29;
        }

        // 4. 校验日期合法性
        if (day > monthDays[month - 1]) {
            if (day >  31) {
                throw new DataException("step2.DateException: 日期必须在1到31之间");
            } else if (day == 31) {
                throw new DataException("step2.DateException: 该月不能出现31天");
            } else if(day == 30){
                throw new DataException("step2.DateException: 该月只有29天");
            }else {
                 throw new DataException("step2.DateException: 该月只有28天");
            }
        }
    }
    
    public Date getDate() throws ParseException {
        Date date = null;
        /*****Begin*****/
        // 格式化年月日为 "yyyy-MM-dd" 格式（补零保证两位月份/日期）
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = String.format("%04d-%02d-%02d", year, month, day);
        // 转换为Date对象
        date = sdf.parse(dateStr);
        // 输出格式化后的日期
        System.out.println(dateStr);
        /******End******/
        return date;
    }
}

public class customexception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            /*****Begin*****/
            // 1. 接收三个输入，校验是否为整数（非整数则抛异常）
            int year, month, day;

            // 校验年份输入
            if (!sc.hasNextInt()) {
                throw new InputMismatchException("请输入整数");
            }
            year = sc.nextInt();

            // 校验月份输入
            if (!sc.hasNextInt()) {
                throw new InputMismatchException("请输入整数");
            }
            month = sc.nextInt();

            // 校验日期输入
            if (!sc.hasNextInt()) {
                throw new InputMismatchException("请输入整数");
            }
            day = sc.nextInt();

            // 2. 构建DateException对象（触发合法性校验）
            DataException dateException = new DataException(year, month, day);

            // 3. 获取Date对象并输出格式化日期
            dateException.getDate();
            /******End******/
        } catch (InputMismatchException e) {
            // 处理非整数输入异常，输出指定格式信息
            System.out.println("java.util.InputMismatchException:请输入整数");
        } catch (DataException e) {
            // 处理日期合法性异常，输出自定义提示
            System.out.println(e.getMessage());
        } catch (ParseException e) {
            // 处理日期解析异常（兜底）
            e.printStackTrace();
        } finally {
            // 关闭扫描器，释放资源
            sc.close();
        }
    }
}
