import java.util.HashMap;
import java.util.Map;

/**
 * Copyright © 2016 首都信息发展股份有限公司  All rights reserved
 *
 * @author Chenguangming
 * @version 1.0
 * <b>日期：</b>2020-12-03<br>
 */
public class TestGithub {
    public static void main(String[] args) {
        System.out.println ("modify changes commit ............");

        System.out.println ("-------begin call method------");
        Map<String, Object> params = new HashMap<String, Object> ();
        params.put ("xingming", "张三");
        params.put ("zjlx", "01");
        params.put ("zjhm", "110228198503083322");
        test(params);
        System.out.println ("------------end method -------");
    }

    public static void test(Map<String, Object> params) {
        System.out.println (params.get ("xingming"));
    }
}
