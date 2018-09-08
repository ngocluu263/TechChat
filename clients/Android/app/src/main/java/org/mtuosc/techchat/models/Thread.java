package org.mtuosc.techchat.models;

import org.json.JSONException;
import org.mtuosc.techchat.UserData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Thread {
    private final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'",
                                                                 Locale.getDefault());

    // meta data
    private String boardID;
    private String posterUsername ;
    private String posterEmail;
    private Date creationDate;
    private Date lastUpdateDate;
    private boolean isDeleted;

    // data about thread
    private String threadID;
    private String title;
    private String content;

    public Thread(String id, String title, String content) {
        this.threadID = id;
        this.title = title;
        this.content = content;
    }

    public UserData getPosterData() {
        return new UserData("hello world!");
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(String creationDate) throws ParseException {
        this.creationDate = format.parse(creationDate);
    }

    public boolean isDeleted () {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    /**
     * @return The board data that the thread is in.
     *         If a json exception happens, the method will return null
     */
    public Board getBoard()  {
        // TODO: Make a factory method for lazy refs
        try {
           return BoardsFactory.createBoardFromJSON("Hello world");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }
}
