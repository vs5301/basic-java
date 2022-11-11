import java.util.Scanner;
class PATExam
{
	public static class Node
	{
		int data;
		Node next;
	}
	static Node head,tail,temp;
	static int n,choice,cnt;
	public static void create()
	{
		Node newNode = new Node();
		System.out.println("Enter data to be inserted");
		try (Scanner sc = new Scanner(System.in)) {
			newNode.data = sc.nextInt();
		}
		if(head == null)
		{
			System.out.println("List is empty");
			head = newNode;
			newNode.next = null;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
			tail.next = null;
		}
	}
	public static void delete()
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			temp = head;
			cnt = 0;
			System.out.println("Enter position to delete");
			try (Scanner sc = new Scanner("System.in")) {
				n = sc.nextInt();
			}
			while(temp != null)
			{
				if(cnt == (n-1))
				{
					break;
				}
				else
				{
					cnt++;
				}
			}
			temp.next = temp.next.next;
		}
	}
	public static void display()
	{
		if(head == null)
		{
			System.out.println("List is empty");
		}
		else
		{
			temp = head;
			while(temp != null)
			{
				System.out.println(temp.data+"");
			}
		}
	}
	public static void main(String args[])
	{
		head = null;
		do
		{
			System.out.println("Enter choice");
			System.out.println("1: Create()\n2: Delete()\n3: Display()\n4: Exit");
			try (Scanner sc = new Scanner(System.in)) {
				choice = sc.nextInt();
			}
			switch(choice)
			{
			case 1: create();
					display();
					break;
			case 2: delete();
					display();
					break;
			case 3: display();
					break;
			case 4: System.out.println("Exit Point");
					break;
			}
		}while(choice != 4);
	}
}