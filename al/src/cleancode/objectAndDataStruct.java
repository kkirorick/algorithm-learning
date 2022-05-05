package cleancode;

import java.io.File;

public class objectAndDataStruct {
    /**
     * 디미터 법칙
     * 객체는 조회 함수로 내부 구조를 공개해선 안된다는 의미 
     * 
     * 밑에 코드 예제 2개는 디미터 법칙에 위반이 될까?
     * 
     * 
     */

    // 이러한 소스를 기차충돌이라고 한다.
    final String outputDir = ctxt.getOptions().getScratchDir().getAbsolutePath();

    // 위의 코드는 이렇게 나누는게 좋다. 
    Options opts = ctxt.getOptions();
    File scratchDir = opts.getScratchDir();
    final String cloneOutputDir = scratchDir.getAbsolutePath();

    
}
