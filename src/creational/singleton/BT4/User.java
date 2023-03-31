package creational.singleton.BT4;

public class User {
    public void vote(Candidate c) {
        Election election = Election.Instance();
        election.Vote(c);
    }
}
