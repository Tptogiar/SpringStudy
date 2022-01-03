package _06_InjectListUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/2 - 18:09
 */
public class Student {

    private String[] array;
    private List list;
    private Set set;
    private Map map;
    private List listUtil;

    public Student() {
    }

    public Student(String[] array, List list, Set set, Map map) {
        this.array = array;
        this.list = list;
        this.set = set;
        this.map = map;
    }

    public List getListUtil() {
        return listUtil;
    }

    public void setListUtil(List listUtil) {
        this.listUtil = listUtil;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}
