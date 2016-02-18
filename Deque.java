
public class Deque<someOb> {
	private Element head;
	private Element tail;
	
	public void push(someOb input) {
		Element newTail = new Element(input);
		if(tail != null) {
			newTail.prev = tail;
			tail.next = newTail;;
			tail = newTail;
		} else {
			head = newTail;
			tail = head;
		}
	}
	
	public someOb pop() {
		someOb result = tail.data;
		if (tail!=head) {
			tail = tail.prev;
			tail.next = null;
		} else {
			tail = null;
			head = null;
		}
		return result;
	}
	
	public void unshift(someOb input) {
		Element newHead = new Element(input);
		if(head != null) {
			newHead.next = head;
			head.prev = newHead;
			head = newHead;
		} else {
			head = newHead;
			tail = head;
		}
	}
	
	public someOb shift() {
		someOb result = head.data;
		if (head != tail) {
			head = head.next;
			head.prev = null;
		} else {
			head = null;
			tail = null;
		}
		return result;
	}
	
	private class Element {
		someOb data;
		Element next, prev;
		
		public Element(someOb input) {
			this.data = input;
		}
	}
}
