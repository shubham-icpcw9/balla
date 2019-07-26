package com.example.android.cwc2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int ri=0, ra=0, wa=0, wi=0, bi=0, ba=0;
    public void displayrind(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_i_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayraus(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
        if(ra > ri)
            displayMessage("AUSTRALIA WON");
    }

    public void displaywind(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_i_wick);
        scoreView.setText(String.valueOf(score));
    }

    public void displaywaus(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_wick);
        scoreView.setText(String.valueOf(score));
        if(wa > 9)
        {
            if(ra > ri)
                displayMessage("AUSTRALIA WON");
            else
                displayMessage("INDIA WON");
        }
    }

    public void displaybrind(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_i_ball);
        scoreView.setText(String.valueOf(score));
    }

    public void displaybaus(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_ball);
        scoreView.setText(String.valueOf(score));
        if(ba > 299)
        {
            if(ra > ri)
                displayMessage("AUSTRALIA WON");
            else
                displayMessage("INDIA WON");
        }
    }

    public void onerun(View v)
    {
        if(wi < 10 && bi < 300)
        {
            ri += 1;
            bi++;
            displaybrind(bi);
            displayrind(ri);
        }
        else
        {
            ra += 1;
            ba++;
            displaybaus(ba);
            displayraus(ra);
        }
    }

    public void dball(View v)
    {
        if(wi < 10 && bi < 300)
        {
            bi++;
            displaybrind(bi);
        }
        else
        {
            ba++;
            displaybaus(ba);
        }
    }
    public void tworun(View v)
    {
        if(wi < 10 && bi < 300)
        {
            ri += 2;
            bi++;
            displaybrind(bi);
            displayrind(ri);
        }
        else
        {
            ra += 2;
            ba++;
            displaybaus(ba);
            displayraus(ra);
        }
    }

    public void threerun(View v)
    {
        if(wi < 10 && bi < 300)
        {
            ri += 3;
            bi++;
            displaybrind(bi);
            displayrind(ri);
        }
        else
        {
            ra += 3;
            ba++;
            displaybaus(ba);
            displayraus(ra);
        }
    }

    public void fourrun(View v)
    {
        if(wi < 10 && bi < 300)
        {
            ri += 4;
            bi++;
            displaybrind(bi);
            displayrind(ri);
        }
        else
        {
            ra += 4;
            ba++;
            displaybaus(ba);
            displayraus(ra);
        }
    }

    public void sixrun(View v)
    {
        if(wi < 10 && bi < 300)
        {
            ri += 6;
            bi++;
            displaybrind(bi);
            displayrind(ri);
        }
        else
        {
            ra += 6;
            ba++;
            displaybaus(ba);
            displayraus(ra);
        }
    }

    public void irun(View v)
    {
        if(wi < 10 && bi < 300)
        {
            ri += 1;
            displaybrind(bi);
            displayrind(ri);
        }
        else
        {
            ra += 1;
            displaybaus(ba);
            displayraus(ra);
        }
    }

    public void out(View v)
    {
        if(wi < 10 && bi < 300)
        {
            wi++;
            bi++;
            displaywind(wi);
            displaybrind(bi);
        }
        else
        {
            wa++;
            ba++;
            displaywaus(wa);
            displaybaus(ba);
        }
    }

    public void reset(View v)
    {
        ra=0;
        ri=0;
        wa=0;
        wi=0;
        ba=0;
        bi=0;
        displaywaus(wa);
        displaywind(wi);
        displaybaus(ba);
        displaybrind(bi);
        displayraus(ra);
        displayrind(ri);
        displayMessage("");
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.result);
        priceTextView.setText(message);
    }
}
