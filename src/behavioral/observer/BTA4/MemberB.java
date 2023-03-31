package behavioral.observer.BTA4;

public class MemberB implements Topic.I_Member {
    Topic topic;
    @Override
    public void newTopic(int index) {
        System.out.println("Member B có tin mới thứ " + index + ": " +  topic.news.get(index));
    }

    public MemberB(Topic topic) {
        this.topic = topic;
        topic.attach(this);
    }

    public void huyDKTopic() {
        topic.detach(this);
    }

    @Override
    public void updateTopic(int index) {
        System.out.println("Member B có tin cập nhật: " + topic.news.get(index));
    }
}
