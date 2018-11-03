package com.yupi.algorithm.leetcode.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：子域名访问计数
 * 思路：设计键为域名，值为次数的HashMap
 *
 */

public class SubdomainVisits {

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            int count = Integer.parseInt(cpdomain.substring(0, cpdomain.indexOf(' ')));
            List<String> domains = new ArrayList<>();
            String str = cpdomain.substring(cpdomain.indexOf(' ') + 1);
            domains.add(str);
            while (true) {
                int pos = str.indexOf('.');
                if (pos < 0) {
                    break;
                }
                str = str.substring(pos + 1);
                domains.add(str);
            }
            for (String domain : domains) {
                map.put(domain, map.getOrDefault(domain, 0) + count);
            }
        }
        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            res.add(entry.getValue() + " " + entry.getKey());
        }
        return res;
    }
}