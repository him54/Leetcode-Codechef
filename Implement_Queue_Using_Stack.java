class MyQueue {

    Stack<Integer> st;
	public MyQueue() {
		st = new Stack<>();
	}

	public void push(int x) {
		st.add(x);
	}

	public int pop() {
		int val = st.get(0);
		st.remove(0);
		return val;
	}

	public int peek() {
		int val = st.get(0);
		return val;
	}

	public boolean empty() {
		return st.isEmpty() ? true : false;
	}
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
