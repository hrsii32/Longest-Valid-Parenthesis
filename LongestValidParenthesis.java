import java.util.Stack;

public class LongestValidParenthesis {


    public static void main(String[] args){

        String str = "(()";

        Stack<Integer> st = new Stack<>();

        st.push(-1);

        int max = 0;

        for(int i =0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch == '('){
                st.push(i);
            }else{
                st.pop();

                if(st.isEmpty()){
                    st.push(i);
                }else{
                    int length = i - st.peek();
                    max = Math.max(max, length);
                }

            }

        }


        System.out.println(max);

    }

}
