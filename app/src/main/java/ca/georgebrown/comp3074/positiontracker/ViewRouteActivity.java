package ca.georgebrown.comp3074.positiontracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewRouteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_route);

        TextView name = findViewById(R.id.editName);
        TextView date = findViewById(R.id.editDate);
        TextView tags = findViewById(R.id.editTags);
        TextView rating = findViewById(R.id.editRating);

        Bundle extras = getIntent().getExtras();
        String bName = extras.getString("name");
        String bDate = extras.getString("date");
        String bTags = extras.getString("tags");
        String bRating = extras.getString("rating");


        name.setText(bName);
        date.setText(bDate);
        tags.setText(bTags);
        rating.setText(bRating);

        //View current Route button
        Button mapsBtn = findViewById(R.id.btnViewRoute);
        mapsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:43.6711247,-79.4141207"));
                startActivity(i);
            }
        });
    }
}
