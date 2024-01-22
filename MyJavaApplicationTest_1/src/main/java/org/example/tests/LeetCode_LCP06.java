package org.example.tests;

import com.goldsprite.myDebugger.DM;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * leetcode解题<br>
 * <a href="https://leetcode.cn/problems/na-ying-bi/">原文链接</a>
 */
public class LeetCode_LCP06 {

    private final int[] coins = {4, 2, 1};

    public LeetCode_LCP06(){

//        base64();
//        m1();
    }


    /**
     * base64互转
     */
    private void base64() {
        //base64编码
        String originalString = "Hello, Base64!";
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println("Original String: " + originalString);
        System.out.println("Encoded String: " + encodedString);

        String encodedString2 = "SGVsbG8sIEJhc2U2NCE=";
        // Base64解码
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString2);
        String decodedString = new String(decodedBytes);
        System.out.println("Encoded String: " + encodedString2);
        System.out.println("Decoded String: " + decodedString);
    }

    /**
     * 遍历中删除map元素
     */
    private void m1() {
        Map<String, Integer> k = new HashMap<>();
        k.put("AA", 1);
        k.put("BB", 3);
        k.put("CC", 2);

        Iterator<Map.Entry<String, Integer>> iterator = k.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey()+", "+entry.getValue());
            iterator.remove();
        }
        System.out.println(k.size());
    }


    public static String getFileNameNoEx(String filename) {
        if ((filename != null) && (!filename.isEmpty())) {
            int dot = filename.lastIndexOf('.');
            if (dot >-1) {
                return filename.substring(0, dot);
            }
        }
        return filename;
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