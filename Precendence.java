 class Precendence{
public int precendence(char c){
    switch(c){
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        case '^':
            return 3;
        default: return -1;
    }
}

public String infixtoconversion(String exp){
    String postfix="";
    stacks stk = new stacks(exp.length());
    for (int i = 0; i<exp.length();i++){
        char c = exp.charAt(i);
        if (Character.isLetterOrDigit(c)){
            postfix = postfix+c;
        }else{
            if(c=='('){
                stk.push(c);
            }else if (c==')'){
                while (stk.isEmpty() && stk.peek()!='('){
                    postfix = postfix+stk.pop();
                }
                stk.pop();
            }else{
                while(!stk.isEmpty() && precendence(c)<=precendence(stk.peek())){
                    postfix = postfix+stk.pop();                
                }
                stk.push(c);
            }

        }
    }
    while (!stk.isEmpty()){
        postfix = postfix+stk.pop();
    }
    return postfix;
}}


//infix to prefix= table format / code / evaluate prefix 
// make basic calculator from swing

