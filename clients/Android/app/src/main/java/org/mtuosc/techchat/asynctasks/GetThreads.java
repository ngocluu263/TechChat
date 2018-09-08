package org.mtuosc.techchat.asynctasks;

import android.icu.text.Replaceable;
import android.os.AsyncTask;

import com.goebl.david.Response;
import com.goebl.david.Webb;

import org.json.JSONArray;
import org.mtuosc.techchat.ApiUrl;

public class GetThreads extends AsyncTask<Integer, Double, Void> {
    private String cookie;
    private Webb webb = Webb.create();
    private String boardId;

    public GetThreads(String boardId, String cookie) {
        this.boardId = boardId;
        this.cookie = cookie;
        webb.setBaseUri(ApiUrl.SERVER_URL);
    }

    @Override
    protected Void doInBackground(Integer... integers) {
        Response<JSONArray> threadsInJSON = getThreadsFromServer();
        return null;
    }

    private Response<JSONArray> getThreadsFromServer() {
        String apiCall = ApiUrl.GET_BOARDS + boardId + "/";
        return webb.get(apiCall).header("Cookie", "sessionid=" + cookie).asJsonArray();
    }


}
