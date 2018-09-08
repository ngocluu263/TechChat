package org.mtuosc.techchat.models;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class ThreadFactory {

    public static Thread createThreadFromJSON(String json) throws JSONException {
        JSONObject jsonObject = new JSONObject(json);
        String id = jsonObject.getString("id");
        String title = jsonObject.getString("title");
        String content = jsonObject.getString("content");
        Thread thread = new Thread(id, title, content);

        boolean isDeleted = jsonObject.getBoolean("deleted");
        thread.setDeleted(isDeleted);

        String dateCreated = jsonObject.getString( "date_created");
        try {
            thread.setCreationDate(dateCreated);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new JSONException("Date was not formatted correctly");
        }

        return thread;
    }
}
