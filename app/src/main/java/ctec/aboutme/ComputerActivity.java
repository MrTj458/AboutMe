package ctec.aboutme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class ComputerActivity extends AppCompatActivity
{
    private ImageButton openEndButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);

        openEndButton = (ImageButton) findViewById(R.id.toEndFromComputer);

        setupListeners();
    }

    public void setupListeners()
    {
        openEndButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View buttonView) {
                Intent myIntent = new Intent(buttonView.getContext(), EndActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
