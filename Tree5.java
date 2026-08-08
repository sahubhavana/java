int countLeaf(Node* root) {
    if (root == NULL)
        return 0;

    // Leaf node
    if (root->left == NULL && root->right == NULL)
        return 1;

    return countLeaf(root->left)
         + countLeaf(root->right);
}
