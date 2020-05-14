package Stack_Queue_NAVEEN;

public class Stack_implement_usingARRAY {

	int size;
	int arr[];
	int top;

	public Stack_implement_usingARRAY(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return size - 1 == top;
	}

	public int peek() {
		if (!this.isEmpty()) {
			return arr[top];

		} else {
			System.out.println("stack is empty");
			return -1;
		}
	}
	public void push(int element)
	{
		if(!isFull())
		{
			top++;
			arr[top]=element;
			System.out.println("element pushed is  "+element);
			
		}else
		{
			System.out.println("stack is full now");
		}
		
	}
	public int pop()
	{
		if(!isEmpty())
		{
		int returnTOP=top;
		top--;
		System.out.println("popped element is "+arr[returnTOP]);
		return arr[returnTOP];
		}else
		{
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public static void main(String[] args) {
Stack_implement_usingARRAY st=new Stack_implement_usingARRAY(10);
st.pop();
System.out.println("---------------------------------------------");
st.push(2);
st.push(21);
st.push(211);
st.push(2111);
st.push(21111);
st.push(211111);
System.out.println("---------------------------------------------");
st.pop();
st.pop();
int peekk=st.peek();
System.out.println(peekk);
	}

}
