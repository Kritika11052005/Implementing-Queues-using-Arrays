import java.util.*;
public class LeetCode {
    static class Queue{
        static int arr[];
        static int rear=-1;
        static int size;
        Queue(int size){
            arr=new int[size];
            this.size=size;

        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        //enqueue(add)
        public static void enqueue(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        //dequeue(remove)
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
}
    

