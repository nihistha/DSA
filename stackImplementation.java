

public class stackImplementation {
    public boolean checkParanthesis(String exp){
    Bracket b = new Bracket(exp.length());
    String openbracket = "[{(";
    String closebracket = "]})";

    for(int i = 0;i<exp.length();i++){
        char expchar = exp.charAt(i);
        if(openbracket.indexOf(expchar)!=-1){//gives the index of expchar if its present in the openbracket
            b.push(expchar);
        }else{
            int indx = closebracket.indexOf(expchar);
            char crossopenbracket= openbracket.charAt(indx);
            if(b.pop()!=crossopenbracket){
                return false;
            } 
        }
    }
    return true;
    }
    public static void main(String[] args) {
        stackImplementation ts = new stackImplementation();
        System.out.println(ts.checkParanthesis("{[]"));
    }
}
