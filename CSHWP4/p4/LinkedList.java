public class LinkedList {
	private Node list;
	public void LinkedList(){
		list = new Node(null);
	}
	public void addFront(Student s){
		if (list == null){
			list = new Node(s);
		}
		else{
			Node temp = list;
			list = new Node(s);
			list.next = temp;
		}
	}
	public void addTail(Student s){
		if(list == null){
			list = new Node(s);
		}
		else{
			Node temp = new Node(s);
			Node currentNode = list;
			while(currentNode.next != null){
				currentNode = currentNode.next;
			}
			currentNode.next = temp;
		}
	}
	public Student bestStudent(){
		if(list.next!=null){
			Node currentBest = list;
			Node currentNode = list;
			while(currentNode.next!=null){
				currentNode = currentNode.next;
				if(currentBest.data.getGPA()<currentNode.data.getGPA()){
					currentBest = currentNode;
				}
			}
			return currentBest.data;
		}
		else{
			return list.data;
		}
	}
	public void printLinkedList(){
		Node currentNode = list;
		System.out.println(currentNode.data.toString());
		while(currentNode.next!=null){
			currentNode = currentNode.next;
			System.out.println(currentNode.data.toString());
		}
	}
	public int countNodesRec(Node list){
		if(list.next != null){
			return 1 + countNodesRec(list.next);
		}
		else{
			return 1;
		}
	}
	public Student worstStudentRec(Node list){
		if(list.next!=null){
			if(list.data.getGPA() < worstStudentRec(list.next).getGPA()){
				return list.data;
			}
			else{
				return worstStudentRec(list.next);
			}
		}
		else{
			return list.data;
		}
	}
	public Student findWorstStudent(){
		return worstStudentRec(list);
	}
	public int findNodeCount(){
		return countNodesRec(list);
	}
	public void addInOrder(Student s){
		if(list == null){
			list = new Node(s);
		}
		else{
			if(s.compareTo(list.data)==-1){
				Node temp = list;
				list = new Node(s);
				list.next = temp;
			}
			else{
				if(list.next==null){
					list.next = new Node(s);
				}
				else{
					Node prev = list;
					Node currentNode = list.next;
					Node temp;
					if(s.compareTo(currentNode.data)==-1){
						list.next = new Node(s);
						temp = currentNode;
						currentNode = list.next;
						currentNode.next = temp;
					}
					else{
						if(currentNode.next==null){
							currentNode.next = new Node(s);
						}
						else{
							prev = currentNode;
							currentNode= currentNode.next;
							if(s.compareTo(currentNode.data)==-1){
								prev.next = new Node(s);
								temp = currentNode;
								currentNode = prev.next;
								currentNode.next = temp;
							}
							else{
								if(currentNode.next==null){
									currentNode.next = new Node(s);
								}
								else{
									prev = currentNode;
									currentNode= currentNode.next;
									if(s.compareTo(currentNode.data)==-1){
										prev.next = new Node(s);
										temp = currentNode;
										currentNode = prev.next;
										currentNode.next = temp;
									}
									else{
										if(currentNode.next==null){
											currentNode.next = new Node(s);
										}
										else{
											prev = currentNode;
											currentNode= currentNode.next;
											if(s.compareTo(currentNode.data)==-1){
												prev.next = new Node(s);
												temp = currentNode;
												currentNode = prev.next;
												currentNode.next = temp;
											}
											else{
												if(currentNode.next==null){
													currentNode.next = new Node(s);
												}
												else{
													prev = currentNode;
													currentNode= currentNode.next;
													if(s.compareTo(currentNode.data)==-1){
														prev.next = new Node(s);
														temp = currentNode;
														currentNode = prev.next;
														currentNode.next = temp;
													}
													else{
														if(currentNode.next==null){
															currentNode.next = new Node(s);
														}
														else{
															prev = currentNode;
															currentNode= currentNode.next;
															if(s.compareTo(currentNode.data)==-1){
																prev.next = new Node(s);
																temp = currentNode;
																currentNode = prev.next;
																currentNode.next = temp;
															}
															else{
																if(currentNode.next==null){
																currentNode.next = new Node(s);
																}
																else{
																	prev = currentNode;
																	currentNode= currentNode.next;
																	if(s.compareTo(currentNode.data)==-1){
																		prev.next = new Node(s);
																		temp = currentNode;
																		currentNode = prev.next;
																		currentNode.next = temp;
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	private class Node{
		Student data;
		Node next;
		public Node(Student s){
			data = s;
			next = null;
		}
	}
}