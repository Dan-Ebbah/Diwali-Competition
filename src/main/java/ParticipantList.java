import java.util.NoSuchElementException;

public class ParticipantList {

    private ParticipantNode head;
    private int size;

    public ParticipantList() {
        head = null;
    }

    public ParticipantList(ParticipantList oldList) {
        //TODO: should be updated
    }

    public void addToStart(Participant p) {
        insertAtIndex(p, 0);
    }


    public void insertAtIndex(Participant p, int index) throws NoSuchElementException {
        ParticipantNode newNode = new ParticipantNode(p, null);

        if(index == 0) {
            head = new ParticipantNode(p, head);
        } else if(index == size){
            throw new NoSuchElementException();
        } else {
            //check if list is empty
            int currentIndex = 0;
            ParticipantNode currentNode = head;

            while (currentNode != null && currentIndex < index - 1) {
                currentIndex++;
                currentNode = currentNode.next;
            }

            if (currentNode.getNext() != null) {
                newNode.setNext(currentNode.getNext());
                currentNode.setNext(newNode);
            }
        }
        size++;

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ParticipantNode currentNode = head;
        while(currentNode != null) {
            result.append(currentNode.getParticipant().getParticipantName());
            result.append(" -> ");
            currentNode = currentNode.getNext();
        }
        result.append("null \n");
        result.append("There are " + size + " items on the list");
        return result.toString();
    }

    private class ParticipantNode{
        private Participant participant;
        private ParticipantNode next;

        public ParticipantNode() {
            participant = null;
            next = null;
        }

        public ParticipantNode(Participant participant, ParticipantNode next) {
            this.participant = participant;
            this.next = next;
        }

        public ParticipantNode(ParticipantNode oldNode) {
            this.participant = oldNode.getParticipant();
            this.next = oldNode.getNext();
        }

        public ParticipantNode clone() {
            return new ParticipantNode(this);
        }

        public Participant getParticipant() {
            return participant;
        }

        public void setParticipant(Participant participant) {
            this.participant = participant;
        }

        public ParticipantNode getNext() {
            return next;
        }

        public void setNext(ParticipantNode next) {
            this.next = next;
        }
    }
}
