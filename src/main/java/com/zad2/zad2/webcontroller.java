package com.zad2.zad2;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class webcontroller {

    @GetMapping("/kantor")
    public String kantor(Model model){
        
        model.addAttribute("kantorData", new kantorData());
        return "kantorform";
    }

    @PostMapping("/kantor")
    public String kantor(Model model, kantorData kantordata){
        kantordata.calc();
        return "kantorresult";
    }

    //================================================================================

    @Autowired private user user;
    @Autowired private EntryCount entryCount;


    @RequestMapping("/blog")
    public String blog( HttpSession session, final Model model, EntryReceiver ER){
        model.addAttribute("EntryReceiver", new EntryReceiver());

        entryCount.inc();
        model.addAttribute("entryCount", entryCount.getEntry());

        user.setNewEntry(ER.getEntry());
        user.insertentry();
        model.addAttribute("userentries", user.getUserEntries());
                
        return "blogform";
    }



}
