package behavioral.observer.BTA4;

public class MemberA implements Topic.I_Member {

    Topic topic;
    @Override
    public void newTopic(int index) {
        System.out.println("Member A có tin mới: " + topic.news.get(index));
    }

    public MemberA(Topic topic) {
        this.topic = topic;
        topic.attach(this);
    }

    public void huyDKTopic() {
        topic.detach(this);
    }

    @Override
    public void updateTopic(int index) {
        System.out.println("Member A có tin cập nhật: " + topic.news.get(index));
    }
}
