package com.fuyu.dao.impl;
import com.fuyu.dao.BookDao;
import java.util.*;

public class BookDaoImpl implements BookDao {

    private  int[] array1;
    private List<String> list1;
    private Set<String> set1;
    private Map<String,String> map1;
    private Properties properties1;

    public void setArray1(int[] array) {
        this.array1 = array;
    }

    public void setList1(List<String> list) {
        this.list1 = list;
    }

    public void setSet1(Set<String> set) {
        this.set1 = set;
    }

    public void setMap1(Map<String, String> map) {
        this.map1 = map;
    }

    public void setProperties1(Properties properties) {
        this.properties1 = properties;
    }

    @Override
    public void save() {
        System.out.println("book dao save.......");
        System.out.println("遍历数组："+ Arrays.toString(array1));
        System.out.println("遍历List"+list1);
        System.out.println("遍历Set"+set1);
        System.out.println("遍历Map"+map1);
        System.out.println("遍历Properties"+properties1);

    }
}
