package yassyass.phsyic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing Buttons
        ImageButton velo = (ImageButton) findViewById(R.id.Velocity);
        ImageButton accel = (ImageButton) findViewById(R.id.Accel);
        ImageButton  momentum = (ImageButton) findViewById(R.id.Momentum);

        //Initializing Intents or Activities
        final Intent velocityIntent = new Intent(this, VelocityActivity.class);
        final Intent AccelIntent = new Intent(this, AccelActivity.class);
        final Intent MomentumIntent = new Intent(this, MomentumActivity.class);


        //Setting on Click Listeners to go to the Activities
        //region OnClickListeners
        velo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(velocityIntent);
            }
        });

        accel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(AccelIntent);

            }
        });

        momentum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(MomentumIntent);
            }
        });
        //endregion

    }
}
