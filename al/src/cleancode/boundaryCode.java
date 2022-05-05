package cleancode;

public class boundaryCode {

    /**
     * Appender 라는 뭔가가 필요하다는 오류가 생김
     * 
     */

     @Test
    public static void testLogCreate(){
        Logger logger = Logger.getLogger("MyLogger");
        logger.info("hello");
    }
    
    // ...

    /**
     * hello가 들어가는 로그 메시지가 콘솔에 찍힌다.
     *  ConsoleAppender.SYSTEM_OUT를 지워도 콘솔에 찍히는데
     *  PatternLayout 를 지우니 찍히지 않는다.
     *  생성자는 '설정되지 않은 상태' 
     */
    @Test
    public static void testLogAddAppender(){
        Logger logger = Logger.getLogger("MyLogger");
        logger.removeAllAppenders();
        logger.addAppender(new ConsoleAppender(
            new PatternLayout("%p %t %m%n"),
            ConsoleAppender.SYSTEM_OUT));
        logger.info("hello");
    }
    
}
