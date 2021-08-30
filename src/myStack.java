public class myStack {
    int top;
    int s[];
    myStack(int x){     // start a stack th
        s = new int[x];
        top = -1;
    }
    myStack(){
        s = new int[1000];
        top = -1;
    }


    boolean isEmpty(){
        if(top == -1)
            return true;
        return false;
    }
    void push (int x){
        if(top + 1 >=s.length)
            System.out.println("Stack overflow");
        else
            s[++top] = x;
    }

    int pop (){
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            int ans = s[top--];
            return ans;
        }
    }

    int peek (){
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return s[top];
    }
}
