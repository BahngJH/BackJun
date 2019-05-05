package backjun.com;

import java.util.ListIterator;

public class LinkedList 
{
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node 
	{
		private Object data;
		private Node next;	//next 노드가 무엇인지 참조하려면 노드 객체로 만들어야한다.
		
		public Node(Object input)
		{
			this.data = input;
			this.next = null;
		}
		
		public String toString() 
		{
			return String.valueOf(this.data);
		}
	}
	//데이터를 앞에서부터 추가
	public void addFirst(Object input) 
	{
		//inner 클래스의 Node 생성자 호출하고 input값이 data로 들어가고 next는 null인 노드객체 생성
		Node newNode = new Node(input);	
		//새로운 노드는 head가 가리키는걸 가리킨다.
		newNode.next = head;
		//헤드는 새로운 노드를 다시 가리키게 된다.
		head = newNode;
		//엘리먼트의 갯수가 증가한다.
		size++;
		//처음 생성된 노드라면 head와 tail이 가리키는게 같기 때문이다.
		if(head.next==null)
		{
			tail = head;
		}
	}
	//데이터를 뒤에서부터 추가
	public void addLast(Object input)
	{
		Node newNode = new Node(input);
		//처음 생성되는건 뭘 하든 상관없으니 코드를 재사용
		if(size==0) 
		{
			addFirst(input);
		}else {
			//마지막 노드가 새로 생기는 노드를 가리키도록 생성
			tail.next = newNode;
			//tail은 새로 생긴 데이터를 지정하도록 설정
			tail = newNode;
			size++;
		}
		
	}
	//인덱스 번호로 데이터 찾기, 외부에 노출되면 안되기에 public 제거
	//사용자는 그저 10을 주면 우린 10을 주면되지 굳이 부품을 노출 시킬 필요가 없다.
	Node node(int index) 
	{
		Node x = head;
		for(int i=0;i<index;i++)
		{
			x = x.next;
		}
		return x;
	}
	//중간위치에 값 넣기
	public void add(int k, Object input)
	{
		if(k == 0)
		{
			addFirst(input);
		}else {
			Node temp1 = node(k-1);
	        // k 번째 노드를 temp2로 지정합니다.
	        Node temp2 = temp1.next;
	        // 새로운 노드를 생성합니다.
	        Node newNode = new Node(input);
	        // temp1의 다음 노드로 새로운 노드를 지정합니다.
	        temp1.next = newNode;
	        // 새로운 노드의 다음 노드로 temp2를 지정합니다.
	        newNode.next = temp2;
	        size++;
	        // 새로운 노드의 다음 노드가 없다면 새로운 노드가 마지막 노드이기 때문에 tail로 지정합니다.
	        if(newNode.next == null){
	            tail = newNode;
	        }
		}
	}
	//데이터 탐색하기
	public String toString() 
	{
		if(head == null)
		{
			return "[]";
		}
		Node temp = head;
		String str ="[";
		
		while(temp.next != null)
		{
			str += temp.data + ", ";
			temp = temp.next;
		}
		//마지막 노드를 출력값에 포함 시킨다.
		str += temp.data;
		
		return str+"]";
	}
	//처음 위치의 데이터 삭제하기
	public Object removeFirst() 
	{
		//첫번째 노드를 temp로 지정하고 head의 값을 두번째 노드로 변경
		Node temp = head;
		head = temp.next;
		//데이터를 삭제하기 전에 리턴할 값을 임시 변수에 담는다.
		
		Object returnData = temp.data;
		temp = null;
		size--;
		return returnData;
	}
	//데이터 삭제하기
	public Object remove(int k)
	{
		if(k==0) 
		{
			return removeFirst();
		}
		//k-1번째 노드를 temp 값으로 지정
		Node temp = node(k-1);
		//삭제 노드를 todoDelete에 기록해둡니다.
		//삭제 노드를 지금 제거하면 삭제 앞 노드와 삭제 뒤 노드를 연결할 수 없습니다.
		Node todoDeleted = temp.next;
		//삭제 앞 노드의 다음 노드로 삭제 뒤 노드를 지정합니다.
		temp.next = temp.next.next;
		Object returnData = todoDeleted.data;
		//삭제하려는 노드가 마지막 데이터라면 tail을 이전 노드로 변경해준다.
		if(todoDeleted == tail)
		{
			tail = temp;
		}
		//cur.next를 삭제합니다.
		todoDeleted = null;
		size--;
		return returnData;
	}
	public Object removeLast() 
	{
		return remove(size-1);
	}
	
	public int size() 
	{
		return size;
	}
	
	public Object get(int k)
	{
		Node temp = node(k);
		return temp.data;
	}
	//특정값의 인덱스를 알아내는 방법
	public int indexOf(Object data)
	{
		Node temp = head;
		int index = 0;
		
		while(temp.data != data) 
		{
			//찾을 때 까지 이러한 방식으로 반복
			temp = temp.next;
			index++;
			//끝 지점에 도착했는데도 못찾으면 데이터가 없음
			if(temp == null)
				return -1;
		}
		return index;
	}
	
	public ListIterator listIterator() 
	{
		
		return new ListIterator();
	}
	
	public class ListIterator
	{
		private Node next;
		private Node lastReturned;
		private int nextIndex;
		
		ListIterator()
		{
			next = head;
		}
		
		public Object next() 
		{
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.data;
		}
		//현재에 데이터가 있는지 확인하는 메서드
		public boolean hasNext() {
			return nextIndex < size();
		}
		
		public void add(Object input)
		{
			Node newNode = new Node(input);
			
			
			if(lastReturned == null) 
			{
				//처음 부분을 입력할 때 로직, 특정부분 분기
				head = newNode;
				newNode.next = next;
			}else {
				lastReturned.next = newNode;
				newNode.next = next;
			}
			lastReturned = newNode;
			nextIndex++;
			size++;
		}
		
		public void remove() {
			if(nextIndex==0)
			{
				throw new IllegalStateException();
			}
			LinkedList.this.remove(nextIndex-1);
			nextIndex--;
		}
	}
	
}
