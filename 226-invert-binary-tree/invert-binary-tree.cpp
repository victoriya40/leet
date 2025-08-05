class Solution {
public:
    TreeNode* invertTree(TreeNode* root) {
     if (root == nullptr) {
            return nullptr;
        }
        // Swap the left and right child
        TreeNode* temp = root->left;
        root->left = invertTree(root->right);
        root->right = invertTree(temp);
        return root;
    }
};