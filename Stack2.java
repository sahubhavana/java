#include <stdio.h>

int main() {
    char s[100], stack[100];
    int top = -1, i;

    printf("Enter expression: ");
    scanf("%s", s);

    for (i = 0; s[i]; i++) {
        if (s[i] == '(')
            stack[++top] = '(';
        else if (s[i] == ')') {
            if (top == -1) {
                printf("Not Balanced");
                return 0;
            }
            top--;
        }
    }

    if (top == -1)
        printf("Balanced");
    else
        printf("Not Balanced");

    return 0;
}
