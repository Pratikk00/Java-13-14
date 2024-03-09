import java.util.LinkedList;

public class q14_57
{
	public static void main(String[] args)
	{
		LinkedList<String> elements = new LinkedList<>();
		
		System.out.println();
		System.out.println("ADD elements in Linked List :");
		elements.add("KAKASHI");
		elements.add("GOKU");
		elements.add("DONALD");
		elements.add("GON");
		System.out.println("Linked list : "+elements);
		
		System.out.println("ADD elements at a specific position in Linked List :");
		elements.add(2,"AMMAR");
		System.out.println("Linked list after Insertion : "+elements);
		
		System.out.println("Delete elements at a specific position in Linked List :");
		elements.remove(3);
		System.out.println("Linked list after Deletion : "+elements);
	}
}