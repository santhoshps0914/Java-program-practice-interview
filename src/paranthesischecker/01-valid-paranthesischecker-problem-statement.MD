problem statement
1: Find whether the string is a valid or not. 
The string will have the open and closed curly braces, 
it is valid only when the opening brace should having the closing brace.


ex:
1) {{{}}} - Valid
2) {}{}{{}} - Valid
3) {{}}} - invalid
4) {{{}} - invalid
5) {}}{}{ - invalid

this problem can be solved by using stack as a Data structure
steps are as follows
1) if String is empty return false
2) create a object of Stack
3) for each char in string
        3.1) if char is open parentheses '{' || '(' || '['
            3.1.1) push char to stack
        3.2) if char is close parentheses like '}' || ')' || ']'
            3.2.1) if stack is empty return false
            3.2.2) take the top element of a stack by using peek method
                3.2.2.1) if char is '}' and top element is not '{'
                3.2.2.2) if char is ')' and top element is not '('
                3.2.2.3) if char is ']' and top element is not '['
             3.2.3) in all above cases return false
        3.3) pop out the character
4) return stack is empty, meaning if stack is empty then all the characters has been removed


Time complexity of this algorithm is O(n) and space complexity is O(n)
   