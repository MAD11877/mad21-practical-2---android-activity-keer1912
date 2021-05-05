package sg.edu.np.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView describe = findViewById(R.id.describe);
        Log.d("debug","create");

        Button followBtn = findViewById(R.id.follow_btn);
        User user = new User();
        user.name = "MAD";
        user.description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua";
        user.id = 1;
        user.followed = false;

        TextView name = findViewById(R.id.name);
        name.setText(user.name);
        TextView description = findViewById(R.id.describe);
        description.setText(user.description);

        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!user.followed){ // If not followed , after i click Follow I am following
                    followBtn.setText("Unfollow"); // Thus text shows un-follow
                    user.followed = true;//Thus I am following
                }

                else{ // If I already following , After I click I will un-follow the user
                    followBtn.setText("Follow");//Thus ask to Follow
                    user.followed = false; //Thus setting boolean to false
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("debug","start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debug","stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debug","destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("debug","pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debug","resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("debug","restart");
    }
}