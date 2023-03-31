package behavioral.observer.BTA4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<I_Member> members;
    List<String> news;

    public Topic() {
        this.members = new ArrayList<>();
        this.news = new ArrayList<>();
    }

    public void attach(I_Member member) {
        this.members.add(member);
    }

    public void detach(I_Member member) {
        this.members.remove(member);
    }

    public void addTopic(String str) {
        news.add(str);
        for (I_Member member: members) {
            member.newTopic(this.news.size() - 1);
        }
    }

    public void updateTopic(int index, String str) {
        news.set(index, str);
        for (I_Member member: members) {
            member.updateTopic(index);
        }
    }

    public static interface I_Member {
        void newTopic(int index);
        void updateTopic(int index);
    }
}
