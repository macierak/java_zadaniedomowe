package com.zad2.zad2;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class user {
    
    public List<String> userentries = new ArrayList<String>();

    private String newEntry;

    public void setNewEntry(String i){
        newEntry = i;
    }


    public String getNewEntry(){
        return newEntry;
    }

    public List<String> getUserEntries(){
        if(userentries == null){
            userentries.add(" ");
        }
        return userentries;
    }

    public void insertentry(){
        if(newEntry != null){
            userentries.add(newEntry);
        }
        for (String string : userentries) {
            System.out.println(string);
        }
    }
}
