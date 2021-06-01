class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        boolean foundx = false;
        boolean foundy = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int length = queue.size();
            for(int i = 0; i < length; i++)
            {
                TreeNode temp = queue.remove();
                if(temp.val == x)
                {
                    foundx = true;
                }
                if(temp.val == y)
                {
                    foundy = true;
                }
                if(temp.left != null && temp.right != null)
                {
                    if(temp.left.val == x && temp.right.val == y)
                    {
                        return false;
                    }
                    if(temp.left.val == y && temp.right.val == x)
                    {
                        return false;
                    }
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
            if(foundx == true && foundy == true)
            {
                return true;
            }
            if(foundx == true || foundy == true)
            {
                return false;
            }
        }
        return false;
    }
}
