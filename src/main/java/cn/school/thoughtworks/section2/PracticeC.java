package cn.school.thoughtworks.section2;

import java.util.LinkedHashMap;
import java.util.regex.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        if (collection1 == null) {
            throw new IllegalArgumentException("Input collection cannot be null.");
        }

        // 使用HashMap来保存元素和对应的计数
        Map<String, Integer> resultMap = new HashMap<>();

        // 遍历列表中的元素
        for (String element : collection1) {
            if (element.contains("[")) {
                // 处理形如 "h[3]" 的字符串
                int countStart = element.lastIndexOf('[') + 1;
                int countEnd = element.lastIndexOf(']');
                int value = Integer.parseInt(element.substring(countStart, countEnd));
                String key = element.substring(0, countStart - 1);

                // 如果结果集中已经存在当前键，则将值累加，否则新增键值对
                resultMap.put(key, resultMap.getOrDefault(key, 0) + value);
            } else if (element.contains(":")) {
                // 处理形如 "c:8" 的字符串
                int value = Integer.parseInt(element.split(":")[1]);
                String key = element.split(":")[0];

                // 如果结果集中已经存在当前键，则将值累加，否则新增键值对
                resultMap.put(key, resultMap.getOrDefault(key, 0) + value);
            } else if (element.contains("-")) {
                // 处理形如 "d-5" 的字符串
                int value = Integer.parseInt(element.split("-")[1]);
                String key = element.split("-")[0];

                // 如果结果集中已经存在当前键，则将值累加，否则新增键值对
                resultMap.put(key, resultMap.getOrDefault(key, 0) - value);
            } else {
                // 没有匹配到特殊格式的字符串，则保持原样处理
                resultMap.put(element, resultMap.getOrDefault(element, 0) + 1);
            }
        }

        // 返回统计结果的映射
        return resultMap;
    }
    }

