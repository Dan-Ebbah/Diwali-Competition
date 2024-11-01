public class ParticipantList {

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
