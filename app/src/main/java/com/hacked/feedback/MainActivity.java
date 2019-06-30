package com.hacked.feedback;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar fb;
    TextView result;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fb = findViewById(R.id.feedback);
        result = findViewById(R.id.Text1);

        fb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                //result.setText("You have given "+v);
                switch ((int) v)
                {
                    case 1:
                        result.setText("You are Poor!");
                        break;

                    case 2:
                        result.setText("You are Good!");
                        break;

                    case 3:
                        result.setText("You are Very Good!");
                        break;

                    case 4:
                        result.setText("You are Excellent!");
                        break;

                    case 5:
                        result.setText("You are Fabulous!");
                        break;

                     default:

                }
            }
        });



    }
}
