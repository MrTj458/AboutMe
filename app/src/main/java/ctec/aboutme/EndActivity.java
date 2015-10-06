package ctec.aboutme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class EndActivity extends AppCompatActivity
{
    private ImageButton openMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        openMenuButton = (ImageButton) findViewById(R.id.toMenuFromEnd);

        setupListeners();
    }

    public void setupListeners()
    {
        openMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View buttonView) {
                Intent myIntent = new Intent(buttonView.getContext(), TitleScreenActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
