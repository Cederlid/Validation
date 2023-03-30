package se.iths.bilting.validationexercise;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class MemberController {

   @Autowired
   MemberService service;
    @GetMapping("/all")
    String getAll(Model m){
        m.addAttribute("memberlist", service.getMembers());
        return "allmembers";
    }

    @GetMapping("/new")
    String addNewForm(Model m){
        m.addAttribute("member", new Member());
        return "newmember";
    }

    @PostMapping("/new")
    String addNewMember(@Valid Member member, BindingResult br, Model m ) {
        // NEVER trust a client!!!
        if (br.hasErrors()){
            m.addAttribute("membermessage", "Inte rätt inmatning!");
        }else {
            service.add(member);
        }
        m.addAttribute("member", new Member());
        return "newmember";
    }


}
