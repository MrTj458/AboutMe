package ctec.aboutme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class JobActivity extends AppCompatActivity
{
    private ImageButton openComputerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job);

        openComputerButton = (ImageButton) findViewById(R.id.toComputersFromJob);

        setupListeners();
    }

    public void setupListeners()
    {
        openComputerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View buttonView) {
                Intent myIntent = new Intent(buttonView.getContext(), ComputerActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
