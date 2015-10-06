package ctec.aboutme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class CarsActivity extends AppCompatActivity
{
    private ImageButton openJobButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);

        openJobButton = (ImageButton) findViewById(R.id.toJobFromCars);

        setupListeners();
    }

    public void setupListeners()
    {
        openJobButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View buttonView) {
                Intent myIntent = new Intent(buttonView.getContext(), JobActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }

}
