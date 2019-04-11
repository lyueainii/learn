
public class A {
public static void main(String[] args) {
	Long totalMilliSeconds= Long.parseLong("1542270822542");
    long totalSeconds = totalMilliSeconds / 1000;
    
    //求出现在的秒
    long currentSecond = totalSeconds % 60;
     
    //求出现在的分
    long totalMinutes = totalSeconds / 60;
    long currentMinute = totalMinutes % 60;
     
    //求出现在的小时
    long totalHour = totalMinutes / 60;
    long currentHour = totalHour % 24;
     
    //显示时间
    System.out.println("总毫秒为： " + totalMilliSeconds);
    System.out.println(currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");
    
}
}
