package surya.helloworld;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.view.View;
import android.view.Gravity;




public class MainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = (TextView) findViewById(R.id.textview);
        text.setText("");
        final Button button = (Button) findViewById(R.id.buttons);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                text.setGravity(Gravity.CENTER);
               text.setText("Hello  World");
       }
        });

    }
}
