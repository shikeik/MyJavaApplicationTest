package org.example.tests;

import com.goldsprite.myDebugger.DM;

/**
 * leetcode解题<br>
 * <a href="https://leetcode.cn/problems/na-ying-bi/">原文链接</a>
 */
public class LeetCode_LCP06 {

    private final int[] coins = {4, 2, 1};

    public LeetCode_LCP06(){

        int maxtick = new Solution().minCount(coins);
        DM.WL("maxtick: "+maxtick);
    }


    /**
     * Solution 1: <br>
     * 遍历coins: 对每个元素除2并上入
     */
    public class Solution {
        public int minCount(int[] coins) {
            int tick=0;
            for(int i : coins){
                tick += Math.ceil(i/2f);
            }
            return tick;
        }
    }


    /**
     * Solution 2: <br>
     * 在1的思路基础上, 优化代码: <br>
     * 利用整数/运算自动下舍特性, <br>
     * 先将(i+1)之后在/2, <br>
     * 得到上入的效果, 并且优化代码
     */
    public class Solution2 {
        public int minCount(int[] coins) {
            int tick=0;
            for(int i : coins){
                tick += (i+1)/2;
            }
            return tick;
        }
    }


}