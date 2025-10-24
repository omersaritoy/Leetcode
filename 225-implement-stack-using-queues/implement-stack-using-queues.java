class MyStack {

 int[] arr;
    int top = -1;

    public MyStack() {
        this.arr = new int[10];
    }

    public void push(int x) {
        arr[++top] = x;
    }

    public int pop() {
        return arr[top--];
    }

    public int top() {
        return arr[top];
    }

    public boolean empty() {
        return top == -1;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */