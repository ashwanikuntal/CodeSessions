package com.ds.queue;

public class CheckList {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.addFirst(4);
		list.addFirst(15);
		list.addFirst(15);
		list.addFirst(30);
		list.addFirst(35);
		list.addFirst(40);
		/*System.out.println("Size of list is : " + LinkedList.size());;
		list.viewList(list.findHeadNode());
		System.out.println("\n");
		list.viewList(list.reverseList(list.findHeadNode()));*/
		//list.searchANode(4);
		
		/*list.addLast(100);
		System.out.println();
		System.out.println("Size of list is : " + LinkedList.size());;
		list.printList();
		
		list.addInMiddle(75, 7);
		list.deleteFirst();
		list.deleteLast();
		list.deleteFromMiddle(3);
		System.out.println();
		System.out.println("Size of list is : " + LinkedList.size());;
		list.printList();
		System.out.println();
		System.out.println("Nth element from last is : " + list.findNthNodeFromLast(2));
		System.out.println("\n");
		System.out.print("Reverse Printed List : ");
		ListNode headNode = list.findHeadNode();
		list.printListInReverse(headNode);*/
		
		/*ListNode headNode = list.findHeadNode();
		list.deleteDupNode(headNode);
		list.viewList(list.findHeadNode());*/
		
		ListNode node = list.formLoop(list.findHeadNode());
		System.out.println(list.hasCycle(node));
	}

}
