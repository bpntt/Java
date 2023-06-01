package classwork;

public class program27 {
    public class MyStack{
        Integer[] arr = new Integer[10];
        int size = 0;
        int size(){
            return size;
        }
        boolean empty(){
            return size == 0;
        }
        void push(int num){
            if(size==arr.length){
                Integer[] ar = new Integer[arr.length +10];
                System.arraycopy(arr, 0, ar, 0, arr.length);
                arr = ar;
            }
            arr[size++] = num;
        }
        int peek(){
            return arr[size-1];
        }
        int pop(){
            return arr[--size];
        }
    }
        
    }

