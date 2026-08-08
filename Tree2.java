int findMin(Node* root) {
    if (root == NULL)
        return -1;

    while (root->left != NULL)
        root = root->left;

    return root->data;
}

int findMax(Node* root) {
    if (root == NULL)
        return -1;

    while (root->right != NULL)
        root = root->right;

    return root->data;
}

BST rule:

- Minimum → go completely left
- Maximum → go completely right
