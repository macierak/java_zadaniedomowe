package com.zad2.zad2;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class EntryCount {
    public int entries = 0;

    public void inc() {
        entries++;
    }
    
    public int getEntry() { 
        return entries; 
    }
}
