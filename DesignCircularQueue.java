class MyCircularQueue {
    LinkedList<Integer> list;
    private int size;
    public MyCircularQueue(int k) {
        this.size=k;
        list=new LinkedList<>();
    }
    
    public boolean enQueue(int value) {
        if(list.size()>=size){
            return false;
        }
        list.add(value);
        return true;
    }
    
    public boolean deQueue() {
        if(list.size()<1){
            return false;
        }
        list.remove(0);
        return true;
    }
    
    public int Front() {
        if(list.size()<1)return -1;
        return list.get(0);
    }
    
    public int Rear() {
        if(list.size()<1)return -1;
        return list.get(list.size()-1);
    }
    
    public boolean isEmpty() {
        return list.size()==0;
    }
    
    public boolean isFull() {
        return list.size()==size;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
