class Solution {
    class Stack{
        int size;
        int arr[];
        int top;
        Stack(int n){
            size=n;
            arr=new int[size];
            top=-1;
        }
            void push(int val){
                arr[++top]=val;
            }
            void pop(){
                top--;
            }
            int peek(){
                return arr[top];
            }
            boolean isEmpty(){
                return  top==-1;
            }
        }
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            int n=pushed.length;
            Stack s=new Stack(n);
            int j=0;
            for(int i=0;i<n;i++){
                s.push(pushed[i]);
                while(!s.isEmpty()&&s.peek()==popped[j]){
                    s.pop();
                    j++;
                }
            }
            return s.isEmpty();
    }
}