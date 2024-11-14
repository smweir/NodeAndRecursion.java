//Node.java and RecursionTest.java created by professor


Node Class:
The Node class represents a single element of a binary tree, holding an integer value and pointers to left and right children. This class is fundamental for constructing binary trees, with each Node able to link to two child nodes, forming the tree structure.

Key Parts of the Code:
	•	Data Field (data): Holds the integer value for the node.
	•	Left and Right Pointers: Each Node has a left and right pointer, both initialized to null, allowing the node to connect to child nodes in a binary tree.
	•	Constructor: Accepts an integer parameter to set the data value for the node, initializing left and right to null by default.


RecursionTest Class:
The RecursionTest class demonstrates several recursive algorithms, each solving a unique problem without loops. It includes methods to calculate bunny ears, count occurrences of the letter ‘A’ in a string, and find Fibonacci numbers. Each method is designed to reinforce recursive problem-solving principles.

Key Parts of the Code:
	1.	bunnyEars(int bunnies):
	•	Calculates the total number of ears across a specified number of bunnies, assuming each bunny has two ears.
	•	Recursive Logic: If bunnies is 0, it returns 0; otherwise, it adds 2 (for the current bunny) and calls itself with bunnies - 1.
	•	Example: bunnyEars(2) outputs 4.
	2.	countA(String str):
	•	Counts the occurrences of the letter ‘A’ (or ‘a’) in a given string, moving through the string one character at a time.
	•	Recursive Logic: Checks if the first character is ‘A’ or ‘a’. If true, it adds 1 to the count, then calls itself on the rest of the string.
	•	Example: countA("anastasia") outputs 4.
	3.	fibonacci(int n):
	•	Calculates the nth Fibonacci number using recursive addition.
	•	Recursive Logic: If n is 0, it returns 0; if n is 1, it returns 1; otherwise, it adds the previous two Fibonacci numbers using recursive calls.
	•	Example: fibonacci(9) outputs 34.
	4.	Main Method:
	•	The main method includes commented-out lines to test each of the recursive methods.
	•	Expected Output: Running each method produces results based on the examples above (e.g., bunnyEars(10) would output 20).


CompleteNodes Class
The CompleteNodes class finds and displays all “complete” nodes in a binary tree. A complete node is defined as one with both a left and right child. This program recursively traverses the tree, checking each node for completeness and printing its value if both children are present.

Key Parts of the Code:
	1.	findCompleteNode(Node root):
	•	Traversal and Condition Check: Recursively traverses the binary tree in an inorder manner, checking if each node has both a left and right child (non-null).
	•	If the current node meets this criterion, it prints the node’s data.
	•	Example: Given a binary tree, it prints the nodes where both left and right children exist (e.g., for a given tree structure, nodes 1, 3, and 5 are printed as complete nodes).
	2.	Main Method:
	•	Tree Construction: Builds a sample binary tree with specific nodes for testing the findCompleteNode method.
	•	Expected Output: Displays a list of “complete nodes” from the constructed binary tree. For the example structure provided, it would print 1, 3, and 5 as complete nodes.
