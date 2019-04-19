/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author duy
 */
@ManagedBean(name = "student")
@RequestScoped
public class Data {
    public List<Student> list;
    private String searchText;
    
    public List<Student> getList(){
        System.out.println(searchText);
        list = new ArrayList<>();
        list.add(new Student("001", "phuoc", "male"));
        list.add(new Student("002", "nam", "male"));
        list.add(new Student("003", "minh", "male"));
        list.add(new Student("004", "tuan", "male"));
        list.add(new Student("005", "tung", "male"));
        list.add(new Student("006", "phuc", "male"));
        list.add(new Student("007", "duy", "male"));
        list.add(new Student("008", "vu", "male"));
        list.add(new Student("009", "trong", "male"));
        list.add(new Student("010", "duy", "male"));
        list.add(new Student("011", "phuoc", "male"));
        List<Student> result = new ArrayList<>();
        if (searchText == null) {
            searchText = "";
        }
        System.out.println(searchText);
        for (Student student : list) {
            if (student.getName().contains(searchText)) {
                result.add(student);
            }
        }
        System.out.println(result.size());
        return result;
    }

    /**
     * @return the searchText
     */
    public String getSearchText() {
        return searchText;
    }

    /**
     * @param searchText the searchText to set
     */
    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }
    
}
