qvoid mirror(Node* root) {
    if (root == NULL)
        return;

    // Swap left and right
    Node* temp = root->left;
    root->left = root->right;
    root->right = temp;

    mirror(root->left);
    mirror(root->right);
}

Example:

Before:              After:

      50                 50
     /  \               /  \
   30    70            70    30
  / \    / \           / \   / \
20  40 60  80         80 60 40 20
