package behavioral.observer.BTA4;

public class MainBTA4 {
    public static void main(String[] args) {
        Topic topic = new Topic();
        MemberA memberA = new MemberA(topic);
        MemberB memberB = new MemberB(topic);
        topic.addTopic("Test");
        topic.addTopic("Bài viết mới");
        topic.updateTopic(0, "Bài viết cũ");
    }

}
