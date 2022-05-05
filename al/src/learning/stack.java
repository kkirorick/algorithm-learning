package learning;

import java.util.*;
import java.lang.*;
import java.io.*;
 
public class stack{
    /**
     * 
        push(E item)
        - 해당 item을 Stack의 top에 삽입
        - Vector의 addElement(item)과 동일
        pop()
        - Stack의 top에 있는 item을 삭제하고 해당 item을 반환
        peek()
        - Stack의 top에 있는 item을 삭제하지않고 해당 item을 반환
        empty()
        - Stack이 비어있으면 true를 반환 그렇지않으면 false를 반환
        search(Object o)
        - 해당 Object의 위치를 반환
     */
    public static void main (String[] args) throws java.lang.Exception
    {
        Stack<Integer> stk = new Stack<>();
        
        if(stk.empty()){
            stk.push(1);
            stk.push(2);
            stk.push(3);
        }
        
        if(!stk.empty()){
            if(stk.peek() == 3)
                stk.pop();
                
        }
        
        if(stk.search(3) == -1){
            System.out.println("3 is poped");
        }
    }
}
