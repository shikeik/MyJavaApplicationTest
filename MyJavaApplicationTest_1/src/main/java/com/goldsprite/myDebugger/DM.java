package com.goldsprite.myDebugger;

/**
 * DebugMessage
 */
public class DM {
    public static String[] tags = {
            "default",
            "T1",
    };
    public static void WL(String tag, Object strLine){
        if(!passTag(tag)) return;
        System.out.println("["+tag+"]: "+strLine.toString());
    }
    public static void WL(Object strLine){
        WL(tags[0], strLine.toString());
    }

    public static boolean passTag(String tag){
        for(String i : tags)
            if(i.equals(tag))return true;
        return false;
    }

}
