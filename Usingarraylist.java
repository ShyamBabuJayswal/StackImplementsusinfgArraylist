//list.get()   ---- return value of that index
//list.size-1 -------last index of list
public class Usingarraylist {
    static class stack {
        ArrayList<Integer> List = new ArrayList<>();
    if(list.size==0)

        {
            return;
        }

        //push
        public static void push(int data) {
            list.add(data);
        }

        //pop
        public static int pop() {
            if (isEmpty()) {//funtion 
                return -1;
            }
            int top = list.get(list.size - 1);
            list.reomve(list.size - 1);
            return top;
        }

    }}

