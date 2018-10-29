package com.yupi.algorithm.leetcode.hash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述：员工的重要性
 * <p>
 * 思路：用map来记录id和对象的关系即可，有点前缀树的味道
 */
public class GetImportance {

    private Map<Integer, Employee> map = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        return getImportance(map.get(id));
    }

    public int getImportance(Employee employee) {
        int sum = employee.importance;
        if (employee.subordinates == null) {
            return sum;
        }
        for (Integer subordinate : employee.subordinates) {
            sum += getImportance(map.get(subordinate));
        }
        return sum;
    }

    class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }
}
