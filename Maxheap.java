#include <iostream>
using namespace std;

class MinHeap {
    int arr[100];
    int size;

public:
    MinHeap() {
        size = 0;
    }

    void insert(int value) {
        size++;
        int i = size - 1;
        arr[i] = value;

        while (i > 0) {
            int parent = (i - 1) / 2;

            if (arr[parent] > arr[i]) {
                swap(arr[parent], arr[i]);
                i = parent;
            } else {
                break;
            }
        }
    }

    void deleteMin() {
        if (size == 0) {
            cout << "Heap is empty\n";
            return;
        }

        arr[0] = arr[size - 1];
        size--;

        int i = 0;

        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;

            if (left < size && arr[left] < arr[smallest])
                smallest = left;

            if (right < size && arr[right] < arr[smallest])
                smallest = right;

            if (smallest != i) {
                swap(arr[i], arr[smallest]);
                i = smallest;
            } else {
                break;
            }
        }
    }

    void display() {
        for (int i = 0; i < size; i++)
            cout << arr[i] << " ";
        cout << endl;
    }
};

int main() {
    MinHeap h;

    h.insert(50);
    h.insert(20);
    h.insert(40);
    h.insert(10);
    h.insert(30);

    cout << "Min Heap: ";
    h.display();

    h.deleteMin();

    cout << "After deletion: ";
    h.display();

    return 0;
}
