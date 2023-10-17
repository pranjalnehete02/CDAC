#include <iostream>

class Node {
public:
    int data;
    Node* next;

    Node(int value) : data(value), next(nullptr) {}
};

class LinkedList {
private:
    Node* head;

public:
    LinkedList() : head(nullptr) {}

    // Insert at the end of the list
    void append(int value) {
        Node* newNode = new Node(value);
        if (!head) {
            head = newNode;
        } else {
            Node* current = head;
            while (current->next) {
                current = current->next;
            }
            current->next = newNode;
        }
    }

    // Insert at the beginning of the list
    void prepend(int value) {
        Node* newNode = new Node(value);
        newNode->next = head;
        head = newNode;
    }

    // Delete a node with a given value
    void deleteNode(int value) {
        if (!head)
            return;

        if (head->data == value) {
            Node* temp = head;
            head = head->next;
            delete temp;
            return;
        }

        Node* current = head;
        while (current->next) {
            if (current->next->data == value) {
                Node* temp = current->next;
                current->next = current->next->next;
                delete temp;
                return;
            }
            current = current->next;
        }
    }

    // Search for a value in the list
    bool search(int value) {
        Node* current = head;
        while (current) {
            if (current->data == value)
                return true;
            current = current->next;
        }
        return false;
    }

    // Reverse the list
    void reverse() {
        Node* prev = nullptr;
        Node* current = head;
        Node* nextNode = nullptr;

        while (current) {
            nextNode = current->next;
            current->next = prev;
            prev = current;
            current = nextNode;
        }

        head = prev;
    }

    // Display the linked list
    void display() {
        Node* current = head;
        while (current) {
            std::cout << current->data << " -> ";
            current = current->next;
        }
        std::cout << "nullptr" << std::endl;
    }

    // Destructor to deallocate memory
    ~LinkedList() {
        while (head) {
            Node* temp = head;
            head = head->next;
            delete temp;
        }
    }
};

int main() {
    LinkedList list;

    list.append(1);
    list.append(2);
    list.append(3);
    list.prepend(0);
    list.append(4);

    std::cout << "Original List: ";
    list.display();

    list.deleteNode(2);
    std::cout << "List after deleting 2: ";
    list.display();

    bool found = list.search(3);
    std::cout << "Value 3 is " << (found ? "found" : "not found") << std::endl;

    list.reverse();
    std::cout << "Reversed List: ";
    list.display();

    return 0;
}
