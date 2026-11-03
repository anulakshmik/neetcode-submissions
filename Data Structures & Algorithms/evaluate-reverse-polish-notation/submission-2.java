class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch=tokens[i];
           if(!ch.equals("+")&&!ch.equals("-")&&!ch.equals("*")&&!ch.equals("/")){
            int c=Integer.parseInt(ch);
                stack.push(c);
            }
            else {
                int no1=stack.pop();
                int  no2=stack.pop();
                if(ch.equals("+")){

               
                int result=no2+no1;
                stack.push(result);
            }
            if(ch.equals("-")){

               
                int result=no2-no1;
                stack.push(result);
            }
            if(ch.equals("*")){

               
                int result=no2*no1;
                stack.push(result);
            }
            if(ch.equals("/")){

               
                int result=no2/no1;
                stack.push(result);
            }
        }
        }
        return stack.pop();
        
    }
}
    

