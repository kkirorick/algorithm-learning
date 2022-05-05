package cleancode;

import java.util.*;



public class littleFunction {
    /**
     * 3-2 
     * 
     * 이 함수도 추상화 수준이 두개라고 함
     * 밑에 처럼 함축이 가능하기 때문이다. 
     * wikiPage 부터 시작하는 문장을
     * includeSetupAndTeardownPages 안에 담아놓는것같다. 
     * 
     * @param pageData
     * @param isSuite
     * @return
     * @throws Exception
     */
    public static String renderPageWithSetupAndTeardown(
        PageData pageData, boolean isSuite) throws Exception{
            boolean isTestPage = pageData.hasAttribute("test");

            if(isTestPage){
                WikiPage testPage = pageData.getWikiPage();
                StringBuffer newPageContent = new StringBuffer();
                includeSetupPages(testPage, newPageContent, isSuite);
                //... 함수가 더있다
            }
            return pageData.getHtml();
    }


    /**
     * 3-3
     * 1. 페이지테스트가 테스트 페이지인지 판단
     * 2. 그렇다면 설정페이지와 해제페이지를 넣는다.
     * 3. 페이지를 html로 랜더링한다. 
     * 과연 이것인 한가지만 하는 함수인가??? 의문을 품게된다.
     * 
     * - TO 문단 기술
     * TO renderPageWithSetupAndTeardowns, 페이지가 테스트 페이지인지
     * 확인 한후 테스트 페이지라면 설정 페이지와 해제 페이지에 넣는다. 
     * 테스트 페이지든 아니든 html로 랜더링한다. 
     * 
     * 여기에서 if 문까지 함축을 하게되면 똑같은 내용을 
     * 다르게 표현하는것뿐...
     * 
     * @param pageData
     * @param isSuite
     * @return
     * @throws Exception
     */

    public static String renderPageWithSetupAndTeardowns(
        PageData pageData, boolean isSuite) throws Exception{
            if(isTestPage(pageData)){
                includeSetupAndTeardownPages(pageData, isSuite);
            }
            return pageData.getHtml();
    }

    /**
     * 다형성을 이용한 switch 문
     * 저차원에 숨기고 반복하지 않는 소스
     * 
     * 하지만 문제가 있다.
     * 1. 함수가 길다.
     * 2. 한가지 작업하지 않는다.
     * 3. SRP를 위반한다.
     * - single Responsibility principle: 단일 책임 원칙
     * 올바른 객체 지향을 위한 지표
     * 4. OCP를 위반한다.
     * - open close principle 개방 폐쇄 원칙
     * @param e
     * @return
     * @throws Exception
     */
    public static Money calculatePay(Employee e)
    throws Exception{
        switch (e.type){
            case COMMISSIONED:
                return calculateCommissionedPay(e);
            case HOURLY:
                return calculateHourPay(e);
            default:
                throw new InvalidEmployeeType(e.type);
        }
    };

    /**
     * 여기서 부수효과는 Session.initialize 호출이다.
     * 자칫 잘못하면 세션을 날려버릴수 있다
     * 아.. 제목이 패스워드 확인인데 세션을 날려버릴수 있는 가능성이 있군
     * checkPasswordAndInitializeSession 이라는 이름이 좋다.
     * 
     * @param userName
     * @param pwd
     * @return
     */
    public static boolean checkPassword (String userName, String pwd){
        User user = UserGateWay.findByName(userName);
        if(user != User.NULL){
            String codePhrase = user.getPhraseEncodeByPassword();
            String phrase = cryptographer.decrypt(codePhrase, pwd);
            if("Valid Password".equals(pharse)){
                Session.initialize();
                return true;
            }
        }
        return false;
    }
}
