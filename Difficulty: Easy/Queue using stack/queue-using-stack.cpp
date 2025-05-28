// User function Template for C++

class Queue {
    stack<int> input, output;
    
  public:
    void enqueue(int x) {
        // code here
        input.push(x);
    }

    int dequeue() {

        if (output.empty()) {
            while (!input.empty()) {
                output.push(input.top());
                input.pop();
            }
        }
        if (output.empty()) {
            return -1;
        }
        int x = output.top();
        output.pop();
        return x;
        // code here
    }
};