package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        int[] counts = new int[128]; // ASCII码范围是0-127

        // 遍历输入列表，统计每个元素的出现次数
        for (String element : collection1) {
            char firstChar = element.charAt(0);
            int count = 1;
            int numberEndIndex = -1;

            // 判断是否有后缀表示出现次数
            for (int i = 1; i < element.length(); i++) {
                char ch = element.charAt(i);
                if (ch == '[') {
                    numberEndIndex = i;
                    break;
                }
            }

            if (numberEndIndex != -1) {
                // 解析后缀中的数字
                count = Integer.parseInt(element.substring(numberEndIndex + 1, element.length() - 1));
                firstChar = element.charAt(0);
            }

            // 更新计数数组
            counts[firstChar] += count;
        }

        // 构建结果Map
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                result.put(String.valueOf((char)i), counts[i]);
            }
        }

        return result;
    }
}
