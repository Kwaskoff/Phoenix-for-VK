package biz.dealnote.messenger.model;

public class Conversation {

    private final int id;

    private String title;

    private int unreadCount;

    private String photo50;

    private String photo100;

    private String photo200;

    private int inRead;

    private int outRead;

    private int lastMessageId;

    private Owner interlocutor;

    public Conversation(int id) {
        this.id = id;
    }

    public Conversation setInterlocutor(Owner interlocutor) {
        this.interlocutor = interlocutor;
        return this;
    }

    public Owner getInterlocutor() {
        return interlocutor;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Conversation setTitle(String title) {
        this.title = title;
        return this;
    }

    public int getUnreadCount() {
        return unreadCount;
    }

    public Conversation setUnreadCount(int unreadCount) {
        this.unreadCount = unreadCount;
        return this;
    }

    public String getPhoto50() {
        return photo50;
    }

    public Conversation setPhoto50(String photo50) {
        this.photo50 = photo50;
        return this;
    }

    public String getPhoto100() {
        return photo100;
    }

    public Conversation setPhoto100(String photo100) {
        this.photo100 = photo100;
        return this;
    }

    public String getPhoto200() {
        return photo200;
    }

    public Conversation setPhoto200(String photo200) {
        this.photo200 = photo200;
        return this;
    }

    public int getInRead() {
        return inRead;
    }

    public Conversation setInRead(int inRead) {
        this.inRead = inRead;
        return this;
    }

    public int getOutRead() {
        return outRead;
    }

    public Conversation setOutRead(int outRead) {
        this.outRead = outRead;
        return this;
    }

    public int getLastMessageId() {
        return lastMessageId;
    }

    public Conversation setLastMessageId(int lastMessageId) {
        this.lastMessageId = lastMessageId;
        return this;
    }
}