package com.example.shadhin.buttontestonclick;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/*
    1st way
    I implemented OnClickListener
 */
public class MainActivity extends Activity implements OnClickListener {
    Button clickMe;
    Button clickMe2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickMe = (Button) findViewById(R.id.ClickMe);
        clickMe.setOnClickListener(this);
        clickMe2 = (Button) findViewById(R.id.ClickMe2);
        clickMe2.setOnClickListener(this);
    }



/**
 * This is a method to connect xml button.
 * This method name is not fixed
 *
 * @param v
 */
    public void doSomething(View v) {
        if (v.getId() == R.id.button) {
            Log.e("ButtonCheck", "1st ButtonCheck was Clicked");
        } else if (v.getId() == R.id.button2) {
            Log.w("ButtonCheck", "2nd ButtonCheck was Clicked");
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.ClickMe)
        {
            Log.w("ButtonCheck", "1st Click was clicked");
        }
        else if(v.getId()==R.id.ClickMe2)
        {
            Log.e("ButtonCheck", "2nd Click was clicked");
        }
    }
}
 /*
        2nd way
        I implemented OnClickListener
        use extra class "SHADHIN"
        Inner class
         */
/*
public class MainActivity extends Activity {
    Button clickMe;
    Button clickMe2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Shadhin shadhin = new Shadhin();
        clickMe = (Button) findViewById(R.id.ClickMe);
        clickMe.setOnClickListener(shadhin);
        clickMe2 = (Button) findViewById(R.id.ClickMe2);
        clickMe2.setOnClickListener(shadhin);
    }
    */
/*public void doSomething(View v) {
        if (v.getId() == R.id.button) {
            Log.e("ButtonCheck", "1st ButtonCheck was Clicked");
        } else if (v.getId() == R.id.button2) {
            Log.w("ButtonCheck", "2nd ButtonCheck was Clicked");
        }
    }*//*

    class Shadhin implements OnClickListener {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.ClickMe) {
                Log.w("ButtonCheck", "1st Click was clicked");
            } else if (v.getId() == R.id.ClickMe2) {
                Log.e("ButtonCheck", "2nd Click was clicked");
            }
        }
    }
}*/

/*
        3rd way
        Not implemented OnClickListener
        use Java anonymous class
         */

/*
public class MainActivity extends Activity {
    Button clickMe;
    Button clickMe2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickMe = (Button) findViewById(R.id.ClickMe);
        clickMe.setOnClickListener(obj);
        clickMe2 = (Button) findViewById(R.id.ClickMe2);
        clickMe2.setOnClickListener(obj);
    }

    public void doSomething(View v) {
        if (v.getId() == R.id.button) {
            Log.e("ButtonCheck", "1st ButtonCheck was Clicked");
        } else if (v.getId() == R.id.button2) {
            Log.w("ButtonCheck", "2nd ButtonCheck was Clicked");
        }
    }

    OnClickListener obj = new OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.ClickMe) {
                Log.w("ButtonCheck", "1st Click was clicked");
            } else if (v.getId() == R.id.ClickMe2) {
                Log.e("ButtonCheck", "2nd Click was clicked");
            }
        }
    };
}
*/

