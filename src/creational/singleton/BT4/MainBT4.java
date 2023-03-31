package creational.singleton.BT4;

public class MainBT4 {
    public static void main(String[] args) {
        User u1 = new User();
        u1.vote(Candidate.Donal_Trump);
        User u2 = new User();
        u2.vote(Candidate.Donal_Trump);
        User u3 = new User();
        u3.vote(Candidate.Donal_Trump);
        User u4 = new User();
        u4.vote(Candidate.Joe_Biden);
        User u5 = new User();
        u5.vote(Candidate.Joe_Biden);

        Election.Instance().inThongTin();
    }
}
