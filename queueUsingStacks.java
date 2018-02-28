
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
  public static class MyQueue<T> {

    private Stack<T> stackNewestOnTop = new Stack<T>();
    private Stack<T> stackOldestOnTop = new Stack<T>();

    public void enqueue(T value) {
      stackNewestOnTop.push(value);
    }

    public T dequeue() {
      shiftStack();
      return stackOldestOnTop.pop();
    }

    private void shiftStack() {
      if(stackOldestOnTop.isEmpty()){
        while(!stackNewestOnTop.isEmpty()){
          stackOldestOnTop.push(stackNewestOnTop.pop());
        }
      }
    }

  }
}
