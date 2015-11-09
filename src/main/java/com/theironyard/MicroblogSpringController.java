package com.theironyard;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Created by earlbozarth on 11/9/15.
 */
@Controller
public class MicroblogSpringController {

    ArrayList<Message> messageArrayList = new ArrayList();

    @RequestMapping("/")
    public String home(Model model, HttpServletRequest request){
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");//Casting object to string
        model.addAttribute("username", username);
        model.addAttribute("messages", messageArrayList);
        return "home";//return to "home.html"
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request, String username){
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        return "redirect:/";
    }

    @RequestMapping("/add-message")
    public String message(
            @RequestParam(defaultValue = "Default Blank Message") String message
    ){
        int messageNum = messageArrayList.size();
        Message tempMessage = new Message(messageNum+ 1, message);
        messageArrayList.add(tempMessage);
        return "redirect:/";
    }

    @RequestMapping("/delete-message")
    public String message(
            @RequestParam Integer id
    ){
        messageArrayList.remove(id-1);
        int i = 1;
        for(Message tempMessage: messageArrayList){
            tempMessage.id = i;
            i++;
        }
        return "redirect:/";
    }

}
