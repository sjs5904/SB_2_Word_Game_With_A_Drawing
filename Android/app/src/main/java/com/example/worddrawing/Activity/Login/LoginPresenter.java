package com.example.worddrawing.Activity.Login;

import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.worddrawing.Activity.MainActivity;

import static com.example.worddrawing.Activity.MainActivity.cid;
import static com.example.worddrawing.Activity.MainActivity.cname;
import static com.example.worddrawing.Activity.MainActivity.serverURL;
import static com.example.worddrawing.app.AppController.TAG;

public class LoginPresenter extends AppCompatActivity implements ILoginPresenter {
    Iuser view;
    private StringRequest strReq;

    public LoginPresenter(Iuser v){
        this.view = v;
    }


    @Override
    public void checkLogin(final String user, String pass) {

            RequestQueue queue = Volley.newRequestQueue(this);
            String url = serverURL + "login/" + user + "/" + pass;

            strReq = new StringRequest(Request.Method.GET,
                    url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Log.d(TAG, response);
                    if (response.equals("-1")){
                        Toast.makeText(getApplicationContext(),"Wrong username", Toast.LENGTH_SHORT).show();
                    }
                    else if(response.equals("0")){
                        Toast.makeText(getApplicationContext(),"Wrong password", Toast.LENGTH_SHORT).show();
                    }else{
                        cid = response;
                        cname = user;
                        Toast.makeText(getApplicationContext(),"Welcome "+cname, Toast.LENGTH_SHORT).show();
                        //Intent success = new Intent(this, MainActivity.class);
                        //startActivity(success);
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    VolleyLog.d(TAG, "Error: " + error.getMessage());
                }
            });
            queue.add(strReq);

        }

    }