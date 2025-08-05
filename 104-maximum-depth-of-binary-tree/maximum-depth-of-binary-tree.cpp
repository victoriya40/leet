 class Solution {
public:
    int maxDepth(TreeNode* root) {
     if (root == nullptr) {
            return 0;
        }
        // Recursively get the depth of left and right subtrees
        int leftDepth = maxDepth(root->left);
        int rightDepth = maxDepth(root->right);
        // The depth of the current node is max(left, right) + 1
        return max(leftDepth, rightDepth) + 1;
    }
};