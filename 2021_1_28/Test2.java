package 课件14没讲完的面试题;


import java.util.LinkedList;
import java.util.Queue;
class MyStack {
    private Queue<Integer> qu1 = new LinkedList<>();
    private Queue<Integer> qu2 = new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack() {
        //上面那两行都有初始化了，这里就不写了
    }

    /** Push element x onto stack. */
    public void push(int x) {
        //谁不为空，就放进去
        if(!qu1.isEmpty()){
            qu1.offer(x);
        }else if(!qu2.isEmpty()){
            qu2.offer(x);
        }else {
            qu1.offer(x);
        }


    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(empty()){return -1;}
        //谁不为空，就将size-1个到另外一个为空的队列，然后将最后剩余的那个元素弹出
        if(!(qu1.isEmpty())){
            int size = qu1.size();
            for(int i = 0;i < size-1;i++){//i<qu1.size()-1不行。size会变化！！！！！！！！！！！！1
                int tmp = qu1.poll();
                qu2.offer(tmp);
            }
            return qu1.poll();
        }else {
            int size2 = qu2.size();
            for(int i = 0;i < size2-1;i++){
                int tmp = qu2.poll();
                qu1.offer(tmp);
            }
            return qu2.poll();
        }

    }

    /** Get the top element. *///这个方法啊不能影响上面那俩方法，要保持一个队列为空，一个不为空
    public int top() {

        if(empty()){return -1;}

        if(!(qu1.isEmpty())){
            int size = qu1.size();
            int cur = -1;
            for(int i = 0;i < size;i++){
                cur = qu1.poll();
                qu2.offer(cur);
            }
            return cur;
        }else {
            int size2 = qu2.size();
            int cur = -1;
            for(int i = 0;i < size2;i++){
                cur = qu2.poll();
                qu1.offer(cur);
            }
            return cur;
        }
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {

        return (qu1.isEmpty() && qu2.isEmpty());
    }
}
public class TestMianshi2 {
    public static void main(String[] args) {
        Queue<Integer> qu1 = new LinkedList<>();
        qu1.size();
    }
}
