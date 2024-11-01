import java.util.NoSuchElementException;

public class CompetitionResults {
    public static void main(String[] args) {
        int [] testArray = {1,2};
        try {
            ParticipantList participantList = new ParticipantList();
            participantList.addToStart(new Participant("test", "testName", testArray));
            participantList.addToStart(new Participant("test2", "testName2", testArray));
            System.out.println(participantList);
            Participant participant = new Participant("test3", "testName3", testArray);
            participantList.insertAtIndex(participant, 2);
            System.out.println(participantList);
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }
    }
}
