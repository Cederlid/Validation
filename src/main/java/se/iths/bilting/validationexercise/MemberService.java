package se.iths.bilting.validationexercise;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberService {
    private List<Member> members = new ArrayList<>();

    public void add(Member member) {
        members.add(member);
    }

    public List<Member> getMembers() {
        return members;
    }
}
