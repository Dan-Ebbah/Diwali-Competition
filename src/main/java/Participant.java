import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Participant {

    private String participantID;
    private String participantName;
    private int[] diyaCollection;

    /**
     * @param participantID
     * @param participantName
     * @param diyaCollection
     */
    public Participant(String participantID, String participantName, int[] diyaCollection) {
        this.participantID = participantID;
        this.participantName = participantName;
        this.diyaCollection = diyaCollection;
    }

    /**
     *
     * @param p
     * @param s
     */
    public Participant(Participant p, String s) {
        this.participantID = s;
        this.participantName = p.getParticipantName();
        this.diyaCollection = p.getDiyaCollection();

    }

    public Participant clone() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new participant ID");
        String newID = scanner.nextLine();
        return new Participant(this, newID);
    }

    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public int[] getDiyaCollection() {
        return diyaCollection;
    }

    public void setDiyaCollection(int[] diyaCollection) {
        this.diyaCollection = diyaCollection;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "participantID='" + participantID + '\'' +
                ", participantName='" + participantName + '\'' +
                ", diyaCollection=" + Arrays.toString(diyaCollection) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return Objects.equals(participantName, that.participantName) && Arrays.equals(diyaCollection, that.diyaCollection);
    }
}
