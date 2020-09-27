/*finding the sum of values between two variables l and r in BST*/
//here consider tree is implemented already with node as TreeNode named.

import java.util.Stack;

class RangeSum {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int ans = 0;
        Stack<TreeNode> st = new Stack();
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode node = st.pop();
            if (node != null) {

                if (L <= node.val && node.val <= R) {
                    ans += node.val;
                }
                if (L < node.val) {
                    st.push(node.left);
                }
                if (node.val < R) {
                    st.push(node.right);
                }
            }
        }
        return ans;
    }
}
