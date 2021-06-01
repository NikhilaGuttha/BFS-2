class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int length = queue.size();
            for(int i = 0;i < length;i++)
            {
                TreeNode temp = queue.remove();
                if(i == length-1)
                {
                    result.add(temp.val);
                }
                if(temp.left != null)
                {
                    queue.add(temp.left);
                }
                if(temp.right != null)
                {
                    queue.add(temp.right);
                }
            }
        }
        return result;
    }
}
