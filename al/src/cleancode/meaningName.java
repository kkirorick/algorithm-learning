package cleancode;

import java.util.*;

public class meaningName {
    public static void main(String[] args){
        List<int[]> result = getThem();

        System.out.println(result); 

    }


    /**
     * 1. theList 값에 무엇이 들어가는지?
     * 2. theList 에서 0번째 값이 어째서 중요한가?
     * 3. 값 4는 무슨 의미인가?
     * 4. 함수가 반환하는 리스트 List 를 어떻게 사용하는가?
     */

    public static List<int[]> getThem(){
        List<int[]> list1 = new ArrayList<int[]>();
        List<int[]> theList = new ArrayList<int[]>(); // 예시 

        for(int[] x: theList){
            if(x[0] == 4){
                list1.add(x);
            }
        }
        return list1;
    }

    // 위에 있는 의문들을 좀더 정확한 명칭을 줘야한다. (Ex. 지뢰찾기)
    public static List<int[]> getFlaggedCells(){
        List<int[]> flaggedCells = new ArrayList<int[]>();
        List<int[]> gameBoard = new ArrayList<int[]>(); // 예시 

        for(int[] cell: gameBoard){
        //    if(cell[STATUS_VALUE] == "FlAGGED"){ 
        //        flaggedCells.add(cell);
        //    }
        }
        return flaggedCells;
    }

    /**
     * 
     * @param a1
     * @param a2
     * 함수 인수 이름을 source, destination 을 사용한다면
     * 코드 읽기가 쉬워진다
     * 불용어를 추가한 이름은 아무런 정보를 주지 못함
     * 
     */
    public static void copyChars(char a1[], char a2[]){
        for(int i=0; i<a1.length; i++){
            a2[i] = a1[i];
        }
    }
}
