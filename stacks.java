public class stacks {
    char stk[];
    int top = -1;
    int size;
    stacks(int size){
        this.size = size;
        stk = new char[size];

    }
    char peek(){
        return stk[top];
    }
    boolean isFull(){
        return top==size-1;
    }
    boolean isEmpty (){
        return top == -1;
    }
    public void push(char data){
        if(isFull()){
            System.out.println("Stack full");
        }
        stk[top] = data;
        top ++;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack empty");
        }
        int temp = top;
        top --;
        return stk[temp];
    }
}
