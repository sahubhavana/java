#include <stdio.h>

#define MAX 5
int stack[MAX], top = -1;

int main() {
    int ch, x;

    while (1) {
        printf("\n1.Push\n2.Pop\n3.Display\n4.Exit\n");
        scanf("%d", &ch);

        switch (ch) {
        case 1:
            if (top == MAX - 1)
                printf("Overflow\n");
            else {
                scanf("%d", &x);
                stack[++top] = x;
            }
            break;

        case 2:
            if (top == -1)
                printf("Underflow\n");
            else
                printf("Deleted=%d\n", stack[top--]);
            break;

        case 3:
            for (int i = top; i >= 0; i--)
                printf("%d ", stack[i]);
            printf("\n");
            break;

        case 4:
            return 0;
        }
    }
}
